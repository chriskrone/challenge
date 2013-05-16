package challenge;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static challenge.ArrayChallenge1.*;

public class ArrayChallenge1_changeAllToBiggest_Test {
	
	@Test
	public void changeAllToBiggest_testWorksWithThreeSorted() throws Exception{
		int[] input = new int[]{-1,2,3};
		int[] expected = new int[]{3,3,3};
		int[] results = changeAllToBiggest(input);
		
		for (int i = 0 ; i < results.length ; i++){
			assertThat(results[i], is(equalTo(expected[i])));
		}
	}
	
	@Test
	public void changeAllToBiggest_testWorksWithThreeAllNegativeSorted() throws Exception{
		int[] input = new int[]{-3,-2,-1};
		int[] expected = new int[]{-1,-1,-1};
		int[] results = changeAllToBiggest(input);
		
		for (int i = 0 ; i < results.length ; i++){
			assertThat(results[i], is(equalTo(expected[i])));
		}
	}
	
	@Test
	public void changeAllToBiggest_testWorksWithThreeAllNegativeNotSorted() throws Exception{
		int[] input = new int[]{-3,-1,-2};
		int[] expected = new int[]{-1,-1,-1};
		int[] results = changeAllToBiggest(input);
		
		for (int i = 0 ; i < results.length ; i++){
			assertThat(results[i], is(equalTo(expected[i])));
		}
	}
	
	@Test
	public void changeAllToBiggest_testWorksWithThreeNotSorted() throws Exception{
		int[] input = new int[]{2,3,-1};
		int[] expected = new int[]{3,3,3};
		int[] results = changeAllToBiggest(input);
		
		for (int i = 0 ; i < results.length ; i++){
			assertThat(results[i], is(equalTo(expected[i])));
		}
	}
	
	@Test
	public void changeAllToBiggest_testWorksWithThreeWithMultipleMaxesSorted() throws Exception{
		int[] input = new int[]{2,3,3};
		int[] expected = new int[]{3,3,3};
		int[] results = changeAllToBiggest(input);
		
		for (int i = 0 ; i < results.length ; i++){
			assertThat(results[i], is(equalTo(expected[i])));
		}
	}
	
	@Test
	public void changeAllToBiggest_testWorksWithThreeWithMultipleMaxesNotSorted() throws Exception{
		int[] input = new int[]{3,2,3};
		int[] expected = new int[]{3,3,3};
		int[] results = changeAllToBiggest(input);
		
		for (int i = 0 ; i < results.length ; i++){
			assertThat(results[i], is(equalTo(expected[i])));
		}
	}
	
	@Test
	public void changeAllToBiggest_testWorksWithTwoBiggestFirst() throws Exception{
		int[] input = new int[]{3,2};
		int[] expected = new int[]{3,3};
		int[] results = changeAllToBiggest(input);
		
		for (int i = 0 ; i < results.length ; i++){
			assertThat(results[i], is(equalTo(expected[i])));
		}
	}
	
	@Test
	public void changeAllToBiggest_testWorksWithTwoSmallestFirst() throws Exception{
		int[] input = new int[]{-1,3};
		int[] expected = new int[]{3,3};
		int[] results = changeAllToBiggest(input);
		
		for (int i = 0 ; i < results.length ; i++){
			assertThat(results[i], is(equalTo(expected[i])));
		}
	}
	
	@Test
	public void changeAllToBiggest_testWorksWithOne() throws Exception{
		int[] input = new int[]{3};
		int[] expected = new int[]{3};
		int[] results = changeAllToBiggest(input);
		
		for (int i = 0 ; i < results.length ; i++){
			assertThat(results[i], is(equalTo(expected[i])));
		}
	}
	
	@Test(expected = Exception.class)
	public void changeAllToBiggest_testWorksWithZero() throws Exception{
		int[] input = new int[0];
		changeAllToBiggest(input);
	}
	
	@Test(expected = Exception.class)
	public void changeAllToBiggest_testWorksWithNull() throws Exception{
		int[] input = null;
		changeAllToBiggest(input);
	}

}
