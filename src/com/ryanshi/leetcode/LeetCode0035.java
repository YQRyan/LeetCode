package com.ryanshi.leetcode;

public class LeetCode0035 {

	// 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

	// 你可以假设数组中无重复元素。
	//
	// 示例 1:
	//
	// 输入: [1,3,5,6], 5
	// 输出: 2
	// 示例 2:
	//
	// 输入: [1,3,5,6], 2
	// 输出: 1
	// 示例 3:
	//
	// 输入: [1,3,5,6], 7
	// 输出: 4
	// 示例 4:
	//
	// 输入: [1,3,5,6], 0
	// 输出: 0。

	public static void main(String[] args) {

		LeetCode0035 a = new LeetCode0035();
		int []nums = new int [] {1,2,4,5,7,8};
		System.out.println(a.searchInsert(nums,3));

	}

	 //标准二分法
	public int searchInsert(int[] nums, int target) {
		 
		   if(nums == null) return 0;
	        int low = 0;
	        int high = nums.length-1;
	        while(low <= high){
	            int mid = (low + high) / 2;
	            if(nums[mid] == target)
	                return mid;
	            else if(nums[mid] < target)
	                low = mid + 1;
	            else
	                high = mid - 1;
	        }
	        return low;
	        
	    }
}
