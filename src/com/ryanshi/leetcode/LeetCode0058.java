package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0058 {

	// ����һ����������Сд��ĸ�Ϳո� ' ' ���ַ��������������һ�����ʵĳ��ȡ�
	//
	// ������������һ�����ʣ��뷵�� 0 ��
	//
	// ˵����һ��������ָ����ĸ��ɣ����������κοո���ַ�����
	//
	// ʾ��:
	//
	// ����: "Hello World"
	// ���: 5

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
