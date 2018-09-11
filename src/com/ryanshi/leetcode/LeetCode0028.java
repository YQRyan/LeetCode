package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0028 {

	// 实现 strStr() 函数。

	// 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置
	// (从0开始)。如果不存在，则返回 -1。
	// 示例 1:
	//
	// 输入: haystack = "hello", needle = "ll"
	// 输出: 2
	// 示例 2:
	//
	// 输入: haystack = "aaaaa", needle = "bba"
	// 输出: -1
	public static void main(String[] args) {

		LeetCode0028 a = new LeetCode0028();
		System.out.println(a.strStr("hello","ll"));
		

	}

	 public int strStr(String haystack, String needle) {
		 
	        int p = 0;

	        if (needle.length() == 0) {
	        	return 0;
	        }
	        if (haystack.length() == 0) {
	            return -1;
	        }
	        if (haystack.equals(needle)) {
	            return 0;
	        }

	        for (int i = 0; i < haystack.length(); i++) {
	            if (haystack.charAt(i) != needle.charAt(0)) {
	                continue;
	            }
	            while (p < needle.length() && (i + p) < haystack.length() && needle.charAt(p) == haystack.charAt(i + p)) {
	                p++;
	            }
	            if (p >= needle.length()) {
	                return i;
	            }
	            p=0;
	        }

	        return -1;
	    }
	 
	 
	 public int strStr2(String haystack, String needle) 
	    {
	        if(needle==null||needle.length()==0)return 0;
	        for(int i=0;i<=haystack.length()-needle.length();i++)
	        {
	            if(haystack.substring(i,i+needle.length()).equals(needle))
	            {
	                return i;
	            }
	        }
	        return -1;
	            
	    }

}
