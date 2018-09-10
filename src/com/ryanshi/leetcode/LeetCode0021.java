package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode0021 {

	// 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
	//
	// 示例：
	//
	// 输入：1->2->4, 1->3->4
	// 输出：1->1->2->3->4->4

	public static void main(String[] args) {

		LeetCode0021 a = new LeetCode0021();
		a.mergeTwoLists(null, null);
	}

	/**
	 * Definition for singly-linked list.
	 * 
	 */

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode cur = new ListNode(-1);
		ListNode res = cur;
		

		while (l1 != null || l2 != null) {
			if (l1 == null) {
				cur.next = l2;
				l2 = l2.next;
			} else if (l2 == null) {
				cur.next = l1;
				l1 = l1.next;
			} else if (l1 != null && l2 != null) {
				if (l1.val > l2.val) {
					cur.next = l2;
					l2 = l2.next;
				} else {
					cur.next = l1;
					l1 = l1.next;
				}
			}
			cur = cur.next;
		}

		return res.next;

	}
	
	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		
		if (l1==null) {
			return l2;
		}
		if (l2==null) {
			return l1;
		}
		
		ListNode res=null;
		if (l1.val<=l2.val) {
			res.val=l1.val;
			res.next = mergeTwoLists(l1.next, l2);
			
		}else {
			res.val=l2.val;
			res.next = mergeTwoLists(l1, l2.next);
		}
		
		return res;
		
		
		
	}
	
}
