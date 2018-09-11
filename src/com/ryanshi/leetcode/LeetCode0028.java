package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0028 {

	// ʵ�� strStr() ������

	// ����һ�� haystack �ַ�����һ�� needle �ַ������� haystack �ַ������ҳ� needle �ַ������ֵĵ�һ��λ��
	// (��0��ʼ)����������ڣ��򷵻� -1��
	// ʾ�� 1:
	//
	// ����: haystack = "hello", needle = "ll"
	// ���: 2
	// ʾ�� 2:
	//
	// ����: haystack = "aaaaa", needle = "bba"
	// ���: -1
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
