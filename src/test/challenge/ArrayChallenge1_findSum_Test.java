package challenge;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static challenge.ArrayChallenge1.*;

public class ArrayChallenge1_findSum_Test {
	
	@Test
	public void findSum_testWorksWithThree() throws Exception{
		int[] input = new int[]{1,2,3};
		int expected = 6;
		
		int results = findSum(input);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void findSum_testWorksWithTwo() throws Exception{
		int[] input = new int[]{1,2};
		int expected = 3;
		
		int results = findSum(input);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void findSum_testWorksWithOne() throws Exception{
		int[] input = new int[]{1};
		int expected = 1;
		
		int results = findSum(input);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test(expected = Exception.class)
	public void findSum_testWorksWithZero() throws Exception{
		int[] input = new int[0];
		findSum(input);
	}
	
	@Test(expected = Exception.class)
	public void findSum_testWorksWithNull() throws Exception{
		int[] input = null;
		findSum(input);
	}
	
	@Test
	public void findSum_testWorksWithNegatives() throws Exception{
		int[] input = new int[]{-1,2,3};
		int expected = 4;
		
		int results = findSum(input);
		
		assertThat(results, is(equalTo(expected)));
	}

}
