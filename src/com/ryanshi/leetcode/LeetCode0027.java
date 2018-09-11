package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0027 {
//	����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�
//
//	��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
//
//	Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
//
//	ʾ�� 1:
//
//	���� nums = [3,2,2,3], val = 3,
//
//	����Ӧ�÷����µĳ��� 2, ���� nums �е�ǰ����Ԫ�ؾ�Ϊ 2��
//
//	�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
//	ʾ�� 2:
//
//	���� nums = [0,1,2,2,3,0,4,2], val = 2,
//
//	����Ӧ�÷����µĳ��� 5, ���� nums �е�ǰ���Ԫ��Ϊ 0, 1, 3, 0, 4��
//
//	ע�������Ԫ�ؿ�Ϊ����˳��
//
//	�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

	public static void main(String[] args) {
		
		LeetCode0027 a=new LeetCode0027();
		int []nums = new int [] {1,1,2};
		System.out.println(a.removeElement(nums,1));

	}
	
	 public int removeElement(int[] nums, int val) {
		 
		 int fastIndex=0;
		 int slowIndex=0;
		 
		 for (int i = 0; i < nums.length; i++) {
			 if (nums[fastIndex]==val) {
				 fastIndex++;
			}else{
				nums[slowIndex]=nums[fastIndex];
				 fastIndex++;
				 slowIndex++;
			}
			
		}
		return slowIndex;
	        
	    }

}
