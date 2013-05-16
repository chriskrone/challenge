package challenge;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static challenge.ArrayChallenge1.*;

public class ArrayChallenge1_reverseArray_Test {
	
	@Test
	public void findAverage_testWorksWithThree() throws Exception{
		int[] input = new int[]{1,2,3};
		int[] expected = new int[]{3,2,1};
		int[] results = reverseArray(input);
		
		for (int i = 0 ; i < results.length ; i++){
			assertThat(results[i], is(equalTo(expected[i])));
		}
	}
	
	@Test
	public void findAverage_testWorksWithTwo() throws Exception{
		int[] input = new int[]{1,2};
		int[] expected = new int[]{2,1};
		int[] results = reverseArray(input);
		
		for (int i = 0 ; i < results.length ; i++){
			assertThat(results[i], is(equalTo(expected[i])));
		}
	}
	
	@Test
	public void findAverage_testWorksWithOne() throws Exception{
		int[] input = new int[]{1};
		int[] expected = new int[]{1};
		int[] results = reverseArray(input);
		
		for (int i = 0 ; i < results.length ; i++){
			assertThat(results[i], is(equalTo(expected[i])));
		}
	}
	
	@Test(expected = Exception.class)
	public void reverseArray_testWorksWithZero() throws Exception{
		int[] input = new int[0];
		reverseArray(input);
	}
	
	@Test(expected = Exception.class)
	public void reverseArray_testWorksWithNull() throws Exception{
		int[] input = null;
		reverseArray(input);
	}

}
