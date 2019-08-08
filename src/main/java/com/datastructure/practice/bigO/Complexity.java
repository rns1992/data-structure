package com.datastructure.practice.bigO;

import java.util.Arrays;

public class Complexity {
	
	/**
	 * O[1]
	 * This function runs in O[1] time ( or "constant time") relative to its input
	 * The input array could be 1 item or 1000 item
	 * but this function require just one step
	*/
	public static void printFirstItem(int[] arrayOfItems) {
		System.out.println(arrayOfItems[0]);
	}
	
	/**
	 * O[N]
	 * This function runs in O[n] time
	 * where n is number of item in an array
	 * If the array has 10 items then we have to print 10 items
	 * It it has 100 then we have to print 1000 
 	*/
	public static void printAllItem(int[] arrayOfItems) {
		for(int item : arrayOfItems) {
			System.out.println(item);
		}
	}
	
	/**
	 * O[N^2]
	 * Here we are nesting 2 loops
	 * If our array has n times then our outer loop runs n times and our inner loop also runs n times,
	 * printing n^2 times
	 * If the array has 10 items then it will print 100 items
	 */
	public static void printAllPossibleOrderPairs(int[] arrayOfItems) {
		for(int firstItem : arrayOfItems) {
			for(int secondItem : arrayOfItems) {
				int[] orderPair = new int[] {firstItem, secondItem};
				System.out.println(Arrays.toString(orderPair));
			}
		}
	}
	
	/**
	 * O[N] + O[N] = O[N]
	 * When we are calculating big O complexity of something we have to ignore constants
	 */
	public static void printAllItemsTwice(int[] arrayOfItems) {
		for(int item : arrayOfItems) {
			System.out.println(item);
		}
		for(int item : arrayOfItems) {
			System.out.println(item);
		}
	}

}
