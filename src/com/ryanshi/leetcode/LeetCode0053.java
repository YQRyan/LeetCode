package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0053 {

//	给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//
//	示例:
//
//	输入: [-2,1,-3,4,-1,2,1,-5,4],
//	输出: 6
//	解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
//	进阶:
//
//	如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。

	public static void main(String[] args) {
		
		LeetCode0053 a=new LeetCode0053();
		int []nums = new int [] {-2,-1};
		System.out.println(a.maxSubArray(nums));
	}
	
	 public int maxSubArray(int[] nums) {
		 int begin_index=0;
 		 int end_index=0;
		 int sum=0;
		 int res=nums[0];
		 
		 for (int i = 0; i < nums.length; i++) {
			if (nums[i]<0) {
				if (sum+nums[i]<0) {
					end_index++;
					begin_index=end_index;
					sum=0;
				}else {
					end_index++;
					sum=sum+nums[i];
				}
			}else {
				end_index++;
				sum=sum+nums[i];
			}
			
			if (res<sum && sum!=0) {
				res=sum;
			}
			if (res<nums[i]) {
				res=nums[i];
			}
		}
		 
		return res;
	        
	    }

}
