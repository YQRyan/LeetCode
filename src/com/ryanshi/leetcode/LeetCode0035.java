package com.ryanshi.leetcode;

public class LeetCode0035 {

	// ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�

	// ����Լ������������ظ�Ԫ�ء�
	//
	// ʾ�� 1:
	//
	// ����: [1,3,5,6], 5
	// ���: 2
	// ʾ�� 2:
	//
	// ����: [1,3,5,6], 2
	// ���: 1
	// ʾ�� 3:
	//
	// ����: [1,3,5,6], 7
	// ���: 4
	// ʾ�� 4:
	//
	// ����: [1,3,5,6], 0
	// ���: 0��

	public static void main(String[] args) {

		LeetCode0035 a = new LeetCode0035();
		int []nums = new int [] {1,2,4,5,7,8};
		System.out.println(a.searchInsert(nums,3));

	}

	 //��׼���ַ�
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
