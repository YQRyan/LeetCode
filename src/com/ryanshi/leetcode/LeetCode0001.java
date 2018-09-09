package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0001 {

	// 题目 0001：

	// 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
	// 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
	//

	// 示例:
	//
	// 给定 nums = [2, 7, 11, 15], target = 9
	// 因为 nums[0] + nums[1] = 2 + 7 = 9
	// 所以返回 [0, 1]

	public static void main(String[] args) {

		// int[] num=ArrayUtils.getArrayInSequence(25, 1, 2);
		// ArrayUtils.getArrayOutOfOrder(num);
		int[] num = ArrayUtils.getArrayByRange(10, 0, 10);
		ArrayUtils.printArrayOut(num, 5);
		LeetCode0001 L = new LeetCode0001();

		int[] result = L.twoSum3(num, 8);
		ArrayUtils.printArrayOut(result, 2);
	}
	
	
//最直观的想法 遍历 复杂度  O(n*n)
	public int[] twoSum(int[] nums, int target) {
		int[] a = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					a[0] = i;
					a[1] = j;
					return a;
				}
			}
		}
		return null;

	}
	
	// 第二想法  在第一次做判断的时 直接存入map 借助map.contains 来直接完成匹配

	public int[] twoSum2(int[] nums, int target) {
		int[] a = new int[2];
		Map map = new HashMap();
 		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				a[0] = (int) map.get(target - nums[i]);
				a[1] = i;
				return a;
			} else {
				map.put(nums[i], i);
			}
		}

		return a;

	}
	
	
	public int[] twoSum3(int[] nums, int target) {
	   int [] res = new int[2];
       if(nums==null||nums.length<2)
           return res;
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       for(int i = 0; i < nums.length; i++){
           if(!map.containsKey(target-nums[i])){
               map.put(nums[i],i);
           }else{
               res[0]= map.get(target-nums[i]);
               res[1]= i;
               break;
           }
       }
       return res;
	}
	
}
