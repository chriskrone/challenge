package challenge;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static challenge.ArrayChallenge1.*;

public class ArrayChallenge1_findAverage_Test {
	
	@Test
	public void findAverage_testWorksWithThreeRoundResult() throws Exception{
		int[] input = new int[]{1,2,3};
		double expected = 2;
		
		double results = findAverage(input);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void findAverage_testWorksWithThreeNotRoundResult() throws Exception{
		int[] input = new int[]{1,3,3};
		double expected = (7.0d / 3.0d);
		
		double results = findAverage(input);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void findAverage_testWorksWithTwoNotRoundResult() throws Exception{
		int[] input = new int[]{1,2};
		double expected = 1.5;
		
		double results = findAverage(input);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void findAverage_testWorksWithTwoRoundResult() throws Exception{
		int[] input = new int[]{1,3};
		double expected = 2;
		
		double results = findAverage(input);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void findAverage_testWorksWithOne() throws Exception{
		int[] input = new int[]{5};
		double expected = 5;
		
		double results = findAverage(input);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test(expected = Exception.class)
	public void findAverage_testWorksWithZero() throws Exception{
		int[] input = new int[0];
		findAverage(input);
	}
	
	@Test(expected = Exception.class)
	public void findAverage_testWorksWithNull() throws Exception{
		int[] input = null;
		findAverage(input);
	}
	
	@Test
	public void findAverage_testWorksWithNegatives() throws Exception{
		int[] input = new int[]{-1,2,3};
		double expected = (4.0d)/(3.0d);
		
		double results = findAverage(input);
		
		assertThat(results, is(equalTo(expected)));
	}

}
