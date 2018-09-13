package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0058 {

	// 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
	//
	// 如果不存在最后一个单词，请返回 0 。
	//
	// 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
	//
	// 示例:
	//
	// 输入: "Hello World"
	// 输出: 5

	public static void main(String[] args) {

		LeetCode0058 a = new LeetCode0058();
		System.out.println(a.lengthOfLastWord("a  a "));

	}

	public int lengthOfLastWord(String s) {
		s = s.trim();
		int index = s.lastIndexOf(' ');
		return index == -1 ? s.length() : s.substring(index + 1).length();
		// return new StringBuffer(s).reverse().toString().trim().split(" ")[0].length();

	}

}
