package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0066 {

	// ���������������ַ������������ǵĺͣ��ö����Ʊ�ʾ����
	//
	// ����Ϊ�ǿ��ַ�����ֻ�������� 1 �� 0��
	//
	// ʾ�� 1:
	//
	// ����: a = "11", b = "1"
	// ���: "100"
	// ʾ�� 2:
	//
	// ����: a = "1010", b = "1011"
	// ���: "10101"

	public static void main(String[] args) {

		LeetCode0066 a = new LeetCode0066();
		System.out.println(addBinary("1010", "1011"));

	}

	public static String addBinary(String a, String b) {
		if (a.length() > b.length())
			return addBinary(b, a);
		char[] chara = a.toCharArray();
		char[] charb = b.toCharArray();
		int lena = chara.length;
		int lenb = charb.length;
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		// add the same length numbers
		for (int i = 0; i < lena; i++) {
			int inta = chara[lena - 1 - i] - '0';
			int intb = charb[lenb - 1 - i] - '0';
			sb.append(inta ^ intb ^ carry);
			carry = (inta & intb) | ((inta ^ intb) & carry);
		}
		// add the longer length numbers
		for (int i = lenb - lena - 1; i >= 0; i--) {
			int intb = charb[i] - '0';
			sb.append(intb ^ carry);
			carry = intb & carry;
		}
		// judge the first bit
		if (carry > 0)
			sb.append(carry);
		return sb.reverse().toString();

	}

}
