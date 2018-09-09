package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0009 {

	// �ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
	//
	// ʾ�� 1:
	//
	// ����: 121
	// ���: true
	// ʾ�� 2:
	//
	// ����: -121
	// ���: false
	// ����: �������Ҷ�, Ϊ -121 �� ���������, Ϊ 121- �����������һ����������
	// ʾ�� 3:
	//
	// ����: 10
	// ���: false
	// ����: ���������, Ϊ 01 �����������һ����������

	public static void main(String[] args) {

		System.out.println(LeetCode0009.isPalindrome2(1234321));
	}
//�ַ�������
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

	
//	���ַ�ת����
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
