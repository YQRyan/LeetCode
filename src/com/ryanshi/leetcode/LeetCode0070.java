package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0070 {

	// 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
	//
	// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
	//
	// 注意：给定 n 是一个正整数。
	//
	// 示例 1：
	//
	// 输入： 2
	// 输出： 2
	// 解释： 有两种方法可以爬到楼顶。
	// 1. 1 阶 + 1 阶
	// 2. 2 阶
	// 示例 2：
	//
	// 输入： 3
	// 输出： 3
	// 解释： 有三种方法可以爬到楼顶。
	// 1. 1 阶 + 1 阶 + 1 阶
	// 2. 1 阶 + 2 阶
	// 3. 2 阶 + 1 阶

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
