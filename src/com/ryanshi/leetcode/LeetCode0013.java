package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0013 {

	// �������ְ������������ַ���I�� V�� X�� L��C��D �� M��
	//
	// �ַ� ��ֵ
	// I 1
	// V 5
	// X 10
	// L 50
	// C 100
	// D 500
	// M 1000
	// ���磬 �������� 2 д�� II ����Ϊ�������е� 1��12 д�� XII ����Ϊ X + II �� 27 д�� XXVII, ��Ϊ XX + V +
	// II ��
	//
	// ͨ������£�����������С�������ڴ�����ֵ��ұߡ���Ҳ�������������� 4 ��д�� IIII������ IV������ 1 ������ 5 ����ߣ�����ʾ�������ڴ��� 5
	// ��С�� 1 �õ�����ֵ 4 ��ͬ���أ����� 9 ��ʾΪ IX���������Ĺ���ֻ�������������������
	//
	// I ���Է��� V (5) �� X (10) ����ߣ�����ʾ 4 �� 9��
	// X ���Է��� L (50) �� C (100) ����ߣ�����ʾ 40 �� 90��
	// C ���Է��� D (500) �� M (1000) ����ߣ�����ʾ 400 �� 900��
	// ����һ���������֣�����ת��������������ȷ���� 1 �� 3999 �ķ�Χ�ڡ�
	//
	// ʾ�� 1:
	//
	// ����: "III"
	// ���: 3
	// ʾ�� 2:
	//
	// ����: "IV"
	// ���: 4
	// ʾ�� 3:
	//
	// ����: "IX"
	// ���: 9
	// ʾ�� 4:
	//
	// ����: "LVIII"
	// ���: 58
	// ����: C = 100, L = 50, XXX = 30, III = 3.
	// ʾ�� 5:
	//
	// ����: "MCMXCIV"
	// ���: 1994
	// ����: M = 1000, CM = 900, XC = 90, IV = 4.

	public static void main(String[] args) {
		System.out.println(LeetCode0013.romanToInt("MCMXCIV"));
	}

	public static int romanToInt(String s) {
		final Character str1 = 'I';
		final Character str5 = 'V';
		final Character str10 = 'X';
		final Character str50 = 'L';
		final Character str100 = 'C';
		final Character str500 = 'D';
		final Character str1000 = 'M';

		char[] c = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		map.put(str1000, 1000);
		map.put(str500, 500);
		map.put(str100, 100);
		map.put(str50, 50);
		map.put(str10, 10);
		map.put(str5, 5);
		map.put(str1, 1);

		int res = 0;
		int temp = 0; // ��ʱ������������ǵ�ǰ��������һ����ֵ��ֵ
		int value = 0; // ��ǰ����ֵ�Ĵ�С

		for (int i = c.length-1; i >= 0; i--) {
			value = map.get(c[i]);

			if (temp <= value) {
				res =  res + value;
				temp = value;
			} else {
				res = res-value;
				temp = value;
			}
		}
		return res;

	}
}
