package redoFoundation;
import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;

public class MissingNumberInArray {
	/*
	 * Receive Input array len and array 
	 * sort the array iterate through the array 
	 * If arr[i] not equals arr[i+1] return [i+1] break
	 * 
	 */
	public int Missing(int[] arr, int inp) {
		Arrays.sort(arr);
		int out =0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] + 1 != arr[i + 1]) {
				out = arr[i]+1;
				break;
			}
		}
		return out;
		
	}

	@Test

	public void Test1() {
		Assert.assertEquals(4, Missing(new int[] { 1, 2, 3, 5 }, 5));
	}
	public void Test2() {
		Assert.assertEquals(9, Missing(new int[] {6,1,2,8,3,4,7,10,5}, 10));
	}
	
}
