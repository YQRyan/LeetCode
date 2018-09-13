package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0038 {

	// 报数序列是指一个整照其中的整数的顺序进数序列，按行报数，得到下一个数。其前五项如下：
	//
	// 1. 1
	// 2. 11
	// 3. 21
	// 4. 1211
	// 5. 111221
	// 1 被读作 "one 1" ("一个一") , 即 11。
	// 11 被读作 "two 1s" ("两个一"）, 即 21。
	// 21 被读作 "one 2", "one 1" （"一个二" , "一个一") , 即 1211。
	//
	// 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
	//
	// 注意：整数顺序将表示为一个字符串。

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
