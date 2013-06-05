package challenge;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static challenge.ArrayChallenge2ElectricBoogaloo.*;

public class ArrayChallenge2ElectricBoogaloo_countInstancesOfANumber_Test {
	
	@Test
	public void findBiggestDifference_testWorksWithOneCount() throws Exception{
		int[] input1 = new int[]{1,2,5};
		int input2 = 5;
		int expected = 1;
		int results = countInstancesOfANumber(input1, input2);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void findBiggestDifference_testWorksWithMultipleCount() throws Exception{
		int[] input1 = new int[]{1,2,5,2,3,4,2};
		int input2 = 2;
		int expected = 3;
		int results = countInstancesOfANumber(input1, input2);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void findBiggestDifference_testWorksWithZeroCount() throws Exception{
		int[] input1 = new int[]{1,2,5,2,3,4,2};
		int input2 = 50;
		int expected = 0;
		int results = countInstancesOfANumber(input1, input2);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test(expected = Exception.class)
	public void findBiggestDifference_testWorksWithZero() throws Exception{
		int[] input1 = new int[0];
		countInstancesOfANumber(input1, 1);
	}
	
	@Test(expected = Exception.class)
	public void findBiggestDifference_testWorksWithNull() throws Exception{
		int[] input = null;
		countInstancesOfANumber(input, 1);
	}

}
