package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0007 {

	// ��Ŀ 0007��
	// ����һ�� 32 λ�з����������������е����ֽ��з�ת��

	// ʾ�� 1:
	//
	// ����: 123
	// ���: 321
	// ʾ�� 2:
	//
	// ����: -123
	// ���: -321
	// ʾ�� 3:
	//
	// ����: 120
	// ���: 21
	// ע��:

	public static void main(String[] args) {
		
		LeetCode0007 a=new LeetCode0007();
		System.out.println(a.reverse(7894582));

	}
	
	 public int reverse(int x) {
	        int rev = 0;
	        while (x != 0) {
	            int pop = x % 10;
	            x /= 10;
	            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
	            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
	            rev = rev * 10 + pop;
	        }
	        return rev;
	    }

}
