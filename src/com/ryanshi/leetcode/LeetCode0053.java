package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0053 {

//	����һ���������� nums ���ҵ�һ���������͵����������飨���������ٰ���һ��Ԫ�أ������������͡�
//
//	ʾ��:
//
//	����: [-2,1,-3,4,-1,2,1,-5,4],
//	���: 6
//	����: ���������� [4,-1,2,1] �ĺ����Ϊ 6��
//	����:
//
//	������Ѿ�ʵ�ָ��Ӷ�Ϊ O(n) �Ľⷨ������ʹ�ø�Ϊ����ķ��η���⡣

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
