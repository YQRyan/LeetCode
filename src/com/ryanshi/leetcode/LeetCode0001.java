package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0001 {

	// ��Ŀ 0001��

	// ����һ�����������һ��Ŀ��ֵ���ҳ������к�ΪĿ��ֵ����������
	// ����Լ���ÿ������ֻ��Ӧһ�ִ𰸣���ͬ����Ԫ�ز��ܱ��ظ����á�
	//

	// ʾ��:
	//
	// ���� nums = [2, 7, 11, 15], target = 9
	// ��Ϊ nums[0] + nums[1] = 2 + 7 = 9
	// ���Է��� [0, 1]

	public static void main(String[] args) {

		// int[] num=ArrayUtils.getArrayInSequence(25, 1, 2);
		// ArrayUtils.getArrayOutOfOrder(num);
		int[] num = ArrayUtils.getArrayByRange(10, 0, 10);
		ArrayUtils.printArrayOut(num, 5);
		LeetCode0001 L = new LeetCode0001();

		int[] result = L.twoSum3(num, 8);
		ArrayUtils.printArrayOut(result, 2);
	}
	
	
//��ֱ�۵��뷨 ���� ���Ӷ�  O(n*n)
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
	
	// �ڶ��뷨  �ڵ�һ�����жϵ�ʱ ֱ�Ӵ���map ����map.contains ��ֱ�����ƥ��

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
