package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0038 {

	// ����������ָһ���������е�������˳��������У����б������õ���һ��������ǰ�������£�
	//
	// 1. 1
	// 2. 11
	// 3. 21
	// 4. 1211
	// 5. 111221
	// 1 ������ "one 1" ("һ��һ") , �� 11��
	// 11 ������ "two 1s" ("����һ"��, �� 21��
	// 21 ������ "one 2", "one 1" ��"һ����" , "һ��һ") , �� 1211��
	//
	// ����һ�������� n��1 �� n �� 30��������������еĵ� n �
	//
	// ע�⣺����˳�򽫱�ʾΪһ���ַ�����

	public static void main(String[] args) {

		LeetCode0038 a = new LeetCode0038();
		System.out.println(a.countAndSay(25));

	}

	public String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}

		String res = "1";
		StringBuffer sb = new StringBuffer();
		int[] res_array = new int[] { 1 };

		for (int i = 2; i <= n; i++) {
			res_array = arrayToArray(res_array);
		}
		for (int i = 0; i < res_array.length; i++) {
			if (res_array[i] != 0) {
				sb.append(res_array[i]);
			}
		}
		return sb.toString();
	}

	public int[] arrayToArray(int[] a) {
		int count = 1;
		int[] mid = new int[a.length * 2];
		int newarrayidx = 0;
		for (int i = 0; i < a.length && a[i]!=0; i++) {
			if (i == a.length - 1 || a[i] != a[i + 1]) {
				mid[newarrayidx] = (count);
				mid[newarrayidx + 1] = (a[i]);
				newarrayidx = newarrayidx + 2;
				count = 1;
			} else {
				count++;
			}
		}
		return Arrays.copyOf(mid, newarrayidx);
	}

	public String arrayToString(int[] a) {
		int count = 1;
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < a.length; i++) {
			if (a[i] != a[i + 1]) {
				sb.append("" + count);
				sb.append("" + a[i]);
				count = 1;
			} else {
				count++;
			}
		}
		System.out.println(sb.toString());

		return sb.toString();
	}
}
