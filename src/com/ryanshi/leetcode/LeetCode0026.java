package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0026 {

	// 26.ɾ�����������е��ظ���
	//
	// ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�

	// ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
	//
	// ʾ�� 1:
	//
	// �������� nums = [1,1,2],
	//
	// ����Ӧ�÷����µĳ��� 2, ����ԭ���� nums ��ǰ����Ԫ�ر��޸�Ϊ 1, 2��
	//
	// �㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
	// ʾ�� 2:
	//
	// ���� nums = [0,0,1,1,1,2,2,3,3,4],
	//
	// ����Ӧ�÷����µĳ��� 5, ����ԭ���� nums ��ǰ���Ԫ�ر��޸�Ϊ 0, 1, 2, 3, 4��
	//
	// �㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
	// ˵��:
	//
	// Ϊʲô������ֵ��������������Ĵ���������?
	//
	// ��ע�⣬�����������ԡ����á���ʽ���ݵģ�����ζ���ں������޸�����������ڵ������ǿɼ��ġ�

	public static void main(String[] args) {

		LeetCode0026 a = new LeetCode0026();
		int []nums = new int [] {1,1,2};
		System.out.println(a.removeDuplicates(nums));
		//ArrayUtils.printArrayOut(a.removeDuplicates(nums), 4);
	}

	public int removeDuplicates(int[] nums) {
		
		int fastIndex=1;
		int slowIndex=0;
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[fastIndex]==nums[slowIndex]) {
				
				fastIndex++;
			}else {
				if(fastIndex-slowIndex>1) {
					nums[slowIndex+1]=nums[fastIndex];
					fastIndex++;
					slowIndex++;
				}else { 
					fastIndex++;
					slowIndex++;	
				}
				
			}
		}
		return slowIndex+1 ;

	}

}
