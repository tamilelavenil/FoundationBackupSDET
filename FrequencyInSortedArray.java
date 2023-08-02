package redoFoundation;

import org.junit.Test;

import org.junit.Assert;

public class FrequencyInSortedArray {
	/*
	 * Declare a variable to return count of target Iteretae through the input array
	 * check for the target value If matches the target Increase the count Return
	 * count
	 */
	public int Frequency(int[] arr, int inp) {
		int count = 0;
		for (int i : arr) {
			if (i == inp) {
				count++;
			}
		}
		return count;
	}
	
	@Test
	
	public void Test1() {
		Assert.assertEquals(4, Frequency(new int[] {1, 1, 2, 2, 2, 2, 3},2));
	}
}
