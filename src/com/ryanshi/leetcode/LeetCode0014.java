package com.ryanshi.leetcode;

public class LeetCode0014 {

	// 编写一个函数来查找字符串数组中的最长公共前缀。

	// 如果不存在公共前缀，返回空字符串 ""。
	//
	// 示例 1:
	//
	// 输入: ["flower","flow","flight"]
	// 输出: "fl"
	// 示例 2:
	//
	// 输入: ["dog","racecar","car"]
	// 输出: ""
	// 解释: 输入不存在公共前缀。
	// 说明:
	//
	// 所有输入只包含小写字母 a-z 。

	public static void main(String[] args) {

		LeetCode0014 a = new LeetCode0014();
		System.out.println(a.longestCommonPrefix(new String[] { "abc", "abcd", "ab" }));

	}

	public String longestCommonPrefix(String[] strs) {

		if (strs.length == 0 || strs[0].length() == 0) {
			return "";
		}
		char[] c = strs[0].toCharArray();
		StringBuilder res_c = new StringBuilder("");
		
		for (int i = 0; i < c.length; i++) {
			
			for (int j = 0; j < strs.length; j++) {	
				
				if (i>strs[j].length()-1 || c[i] != strs[j].charAt(i)) {
					return res_c.toString();
				}
				continue;
			}
			res_c.append(c[i]) ;
		}

		return res_c.toString();

	}
}
