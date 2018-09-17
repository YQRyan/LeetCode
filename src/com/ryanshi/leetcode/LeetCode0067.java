package com.ryanshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ryanshi.utils.ArrayUtils;

public class LeetCode0067 {

//	给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//
//	最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
//
//	你可以假设除了整数 0 之外，这个整数不会以零开头。
//
//	示例 1:
//
//	输入: [1,2,3]
//	输出: [1,2,4]
//	解释: 输入数组表示数字 123。
//	示例 2:
//
//	输入: [4,3,2,1]
//	输出: [4,3,2,2]
//	解释: 输入数组表示数字 4321。

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
