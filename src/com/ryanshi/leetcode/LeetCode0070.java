package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0070 {

	// ������������¥�ݡ���Ҫ n ������ܵ���¥����
	//
	// ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�
	//
	// ע�⣺���� n ��һ����������
	//
	// ʾ�� 1��
	//
	// ���룺 2
	// ����� 2
	// ���ͣ� �����ַ�����������¥����
	// 1. 1 �� + 1 ��
	// 2. 2 ��
	// ʾ�� 2��
	//
	// ���룺 3
	// ����� 3
	// ���ͣ� �����ַ�����������¥����
	// 1. 1 �� + 1 �� + 1 ��
	// 2. 1 �� + 2 ��
	// 3. 2 �� + 1 ��

	public static void main(String[] args) {

		LeetCode0070 a = new LeetCode0070();
		System.out.println(a.climbStairs(5));

	}
	public static HashMap<Integer,Integer> map =new HashMap<Integer,Integer>() ;

	public static int climbStairs(int n) {
		
		if (map.containsKey(n)) {
			return map.get(n);
		}
		if (n==1) {
			map.put(1, 1);
			return 1;
		}
		if (n==2) {
			map.put(2, 2);
			return 2;
		}
		
		return climbStairs(n-1)+climbStairs(n-2);

	}
	
	
	public int climbStairs2(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int[] nums = new int[n+1];
        nums[1] = 1;
        nums[2] = 2;
        climb(nums,n);
        return nums[n];
    }
    
    public static void climb(int[]nums, int n){
        int x = n-1;
        int y = n-2;
        if (x > 2 && nums[x] == 0)
            climb(nums,x);
        if (y > 2 && nums[y] == 0) 
            climb(nums,y);
        nums[n] = nums[x] +nums[y];
    }


}
