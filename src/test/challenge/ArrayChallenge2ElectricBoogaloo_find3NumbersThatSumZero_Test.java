package challenge;

import java.util.Arrays;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static challenge.ArrayChallenge2ElectricBoogaloo.*;

public class ArrayChallenge2ElectricBoogaloo_find3NumbersThatSumZero_Test {
	
	@Test
	public void find3NumbersThatSumZero_testWorksWithValidAnswers() throws Exception{
		int[] input = new int[]{1, 3, 0, 5, -4, 2, -1, -3};
		int[] expected1 = new int[]{1, 0, -1};
		Arrays.sort(expected1);
		int[] expected2 = new int[]{-3, 0, 3};
		Arrays.sort(expected2);
		int[] expected3 = new int[]{5, -4, -1};
		Arrays.sort(expected3);
		int[] expected4 = new int[]{3, -4, 1};
		Arrays.sort(expected4);
		int[] results = find3NumbersThatSumZero(input);
		Arrays.sort(results);
		
		boolean found = (areEqual(results, expected1) || areEqual(results, expected2) || areEqual(results, expected3) || areEqual(results, expected4));
		assertThat(found, is(true));
	}
	
	@Test
	public void find3NumbersThatSumZero_testWorksWithNoValidAnswers() throws Exception{
		int[] input = new int[]{1, 3, 0, 5, 4, 2, 1, 3};
		
		int[] results = find3NumbersThatSumZero(input);
		
		assertThat(results, is(nullValue()));
	}
	
	private boolean areEqual(int[] array1, int[] array2){
		if (array1 == null){
			return (array2 == null);
		} else if (array2 == null){
			return false;
		}
		if (array1.length != array2.length){
			return false;
		}
		for (int i = 0 ; i < array1.length ; i++){
			if (array1[i] != array2[i]){
				return false;
			}
		}
		return true;
	}
	
	
	@Test(expected = Exception.class)
	public void find3NumbersThatSumZero_testNullArray() throws Exception{
		find3NumbersThatSumZero(null);
	}
	
	@Test(expected = Exception.class)
	public void find3NumbersThatSumZero_testOneArray() throws Exception{
		find3NumbersThatSumZero(new int[]{1});
	}
	
	@Test(expected = Exception.class)
	public void find3NumbersThatSumZero_testTwoArray() throws Exception{
		find3NumbersThatSumZero(new int[]{1, -1});
	}

}
