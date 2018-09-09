package com.ryanshi.utils;

import java.util.Random;

public class ArrayUtils {

	public static int[] getArrayInSequence(int size, int start, int steps) {

		int[] num = new int[size];
		int index = start;

		for (int i = 0; i < num.length; i++) {
			num[i] = index;
			index = index + steps;
		}

		return num;
	}
	
	public static int[] getArrayByRange(int size, int start, int end) {

		int[] num = new int[size];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (start+Math.random() * (end-start));
		}

		return num;
	}

	public static int[] getArrayOutOfOrder(int[] Oldnum) {

		int[] num = Oldnum;
		int temp = 0;

		for (int i = 0; i < Oldnum.length * 10; i++) {
			int index_a = (int) (Math.random() * Oldnum.length);
			int index_b = (int) (Math.random() * Oldnum.length);
			if (index_a != index_b) {
				temp = num[index_b];
				num[index_b] = num[index_a];
				num[index_a] = temp;
			}
		}

		return num;
	}

	public static void printArrayOut(int[] num, int column) {
		System.out.println("***********************************");
		System.out.println("[");

		for (int i = 0; i < num.length; i++) {
			if ((i != 0 && (i + 1) % column == 0) || i == num.length - 1) {
				System.out.println(num[i] + "\t");
			} else {
				System.out.print(num[i] + "\t");
			}
		}
		System.out.println("]");

		System.out.println("***********************************");

	}

}
