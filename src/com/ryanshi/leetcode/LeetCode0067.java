package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0067 {

//	����һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��
//
//	���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�
//
//	����Լ���������� 0 ֮�⣬��������������㿪ͷ��
//
//	ʾ�� 1:
//
//	����: [1,2,3]
//	���: [1,2,4]
//	����: ���������ʾ���� 123��
//	ʾ�� 2:
//
//	����: [4,3,2,1]
//	���: [4,3,2,2]
//	����: ���������ʾ���� 4321��

	public static void main(String[] args) {

		LeetCode0067 a = new LeetCode0067();
		int []nums = new int [] {1,1,2};
		System.out.println(a.plusOne(nums));

	}

	 public int[] plusOne(int[] digits) {
	        
	        if(digits[digits.length-1] !=9){
	            digits[digits.length -1]=digits[digits.length -1]+1;
	            return digits;
	        }
	      
	        for (int i = digits.length-1; i >=0; i--) {
				if(digits[i]==9){
	                digits[i]=0;
	                if(i==0){
	                 int[]res= new int[digits.length+1];
	                    res[0]=1;
	                  return res;
	                }
	            }else{
	                digits[i]=digits[i]+1;
	                break;
	            }
			}
	    return digits;
 }    

}
