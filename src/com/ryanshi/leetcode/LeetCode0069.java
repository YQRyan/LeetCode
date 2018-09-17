package com.ryanshi.leetcode;

public class LeetCode0069 {

	// ʵ�� int sqrt(int x) ������
	//
	// ���㲢���� x ��ƽ���������� x �ǷǸ�������
	//
	// ���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��
	//
	// ʾ�� 1:
	//
	// ����: 4
	// ���: 2
	// ʾ�� 2:
	//
	// ����: 8
	// ���: 2
	// ˵��: 8 ��ƽ������ 2.82842...,
	// ���ڷ���������������С�����ֽ�����ȥ��

	public static void main(String[] args) {

		LeetCode0069 a = new LeetCode0069();
		System.out.println(a.mySqrt1(2147395599));

	}

	public int mySqrt(int x) {
		if (x==1) {
		return 1;	
		}
		int left = 0;
		int right = x;
		int mid = (left + right) / 2;

		while (mid * mid < x || (mid + 1) * (mid + 1) > x) {
			if (mid * mid > x) {
				right = mid;
			} else if ((mid + 1) * (mid + 1) <= x) {
				left = mid;
			}
			if (mid==(left + right) / 2) {
				return mid;
			}
			mid = (left + right) / 2;
		}

		return mid;

	}
	
	
	public int mySqrt1(int x) {
        if (x == 0) return 0;
        double y = Math.max(1, x/2);
        while (true) {
            double ny = (((double)y*y+x)/2/y);
            if (Math.abs(y-ny) <= 0.01) return (int)ny;
            y=ny;
        }
    }

}
