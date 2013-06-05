package challenge;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static challenge.ArrayChallenge2ElectricBoogaloo.*;

public class ArrayChallenge2ElectricBoogaloo_findBiggestDifference_Test {
	
	@Test
	public void findBiggestDifference_testWorksWithAllPositiveInput() throws Exception{
		int[] input = new int[]{1,2,5};
		int expected = 4;
		int results = findBiggestDifference(input);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void findBiggestDifference_testWorksWithAllNegativeInput() throws Exception{
		int[] input = new int[]{-1,-2,-6};
		int expected = 5;
		int results = findBiggestDifference(input);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void findBiggestDifference_testWorksWithAllMixedInput() throws Exception{
		int[] input = new int[]{-1,3,8};
		int expected = 9;
		int results = findBiggestDifference(input);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test(expected = Exception.class)
	public void findBiggestDifference_testWorksWithZero() throws Exception{
		int[] input = new int[0];
		findBiggestDifference(input);
	}
	
	@Test(expected = Exception.class)
	public void findBiggestDifference_testWorksWithOne() throws Exception{
		int[] input = new int[]{1};
		findBiggestDifference(input);
	}
	
	@Test(expected = Exception.class)
	public void findBiggestDifference_testWorksWithNull() throws Exception{
		int[] input = null;
		findBiggestDifference(input);
	}

}
