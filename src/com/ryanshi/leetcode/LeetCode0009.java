package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0009 {

	// 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
	//
	// 示例 1:
	//
	// 输入: 121
	// 输出: true
	// 示例 2:
	//
	// 输入: -121
	// 输出: false
	// 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
	// 示例 3:
	//
	// 输入: 10
	// 输出: false
	// 解释: 从右向左读, 为 01 。因此它不是一个回文数。

	public static void main(String[] args) {

		System.out.println(LeetCode0009.isPalindrome2(1234321));
	}
//字符串做法
	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		String intStr = ("" + x);
		String frontPart = "";
		String behindPart = "";

		if (intStr.length() % 2 == 0) {
			frontPart = intStr.substring(0, intStr.length() / 2);
			behindPart = intStr.substring(intStr.length() / 2, intStr.length());
		} else {
			frontPart = intStr.substring(0, (intStr.length() - 1) / 2);
			behindPart = intStr.substring((intStr.length() + 1) / 2, intStr.length());
		}
		StringBuilder sbfrontPart = new StringBuilder(frontPart);
		return sbfrontPart.reverse().toString().equals(behindPart);
	}

	
//	数字翻转做法
	public static boolean isPalindrome2(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}
		int origin = x;
		int num = 0;
		while (x > 0) {
			num = num * 10 + x % 10;
			x = x / 10;
		}
		return origin == num;
	}

}
