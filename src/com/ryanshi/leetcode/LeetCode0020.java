package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode0020 {

	// 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
	//
	// 有效字符串需满足：
	//
	// 左括号必须用相同类型的右括号闭合。
	// 左括号必须以正确的顺序闭合。
	// 注意空字符串可被认为是有效字符串。
	//
	// 示例 1:
	//
	// 输入: "()"
	// 输出: true
	// 示例 2:
	//
	// 输入: "()[]{}"
	// 输出: true
	// 示例 3:
	//
	// 输入: "(]"
	// 输出: false
	// 示例 4:
	//
	// 输入: "([)]"
	// 输出: false
	// 示例 5:
	//
	// 输入: "{[]}"
	// 输出: true

	public static void main(String[] args) {

		LeetCode0020 a = new LeetCode0020();
		System.out.println(a.isValid("()[]{}"));
	}

	public boolean isValid(String s) {
		final String LeftSmall = "(";
		final String RightSmall = ")";
		final String LeftMedium = "[";
		final String RightMedium = "]";
		final String LeftLarge = "{";
		final String RightLarge = "}";

		HashMap<String, String> map = new HashMap<String, String>();

		map.put(LeftSmall, RightSmall);
		map.put(LeftMedium, RightMedium);
		map.put(LeftLarge, RightLarge);
		if (s.equals("")) {
			return true;
		}

		List list = new ArrayList(Arrays.asList(s.replace(" ", "").split("")));

		if (list.size() % 2 == 1) {
			return false;

		}
		
		int index = 0;
		while (list.size() > 0 && index + 1 < list.size()) {

			if (list.get(index + 1).equals(map.get(list.get(index)))) {
				list.remove(index + 1);
				list.remove(index);
				index = index - 1;
				if (index<0) {
					index=0;
				}
			} else {
				index = index + 1;
			}

			if (list.size() == 0) {
				return true;
			}
		}
		return false;

	}

	// while (list.size()>0) {
	// if (list.get(list.size()-1).equals(map.containsValue(list.get(0)))) {
	// list.remove(list.size()-1);
	// list.remove(0);
	// }else {
	// return false;
	// }
	// }
	
	
	public boolean isValid2(String s) {
        while(s.contains("()")||s.contains("[]")||s.contains("{}")){
			s = s.replace("()", "").replace("[]", "").replace("{}", "");
		}
		if(s.length()!=0)
			return false;
		return true;
    }
}
