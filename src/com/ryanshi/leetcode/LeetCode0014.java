package com.ryanshi.leetcode;

public class LeetCode0014 {

	// ��дһ�������������ַ��������е������ǰ׺��

	// ��������ڹ���ǰ׺�����ؿ��ַ��� ""��
	//
	// ʾ�� 1:
	//
	// ����: ["flower","flow","flight"]
	// ���: "fl"
	// ʾ�� 2:
	//
	// ����: ["dog","racecar","car"]
	// ���: ""
	// ����: ���벻���ڹ���ǰ׺��
	// ˵��:
	//
	// ��������ֻ����Сд��ĸ a-z ��

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
