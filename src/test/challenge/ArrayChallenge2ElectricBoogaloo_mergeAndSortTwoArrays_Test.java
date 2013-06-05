package challenge;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static challenge.ArrayChallenge2ElectricBoogaloo.*;

public class ArrayChallenge2ElectricBoogaloo_mergeAndSortTwoArrays_Test {
	
	@Test
	public void mergeAndSortTwoArrays_testWorksWithTwoNormalArrays() throws Exception{
		int[] input1 = new int[]{1,2,5};
		int[] input2 = new int[]{-1,4,10};
		int[] expected = new int[]{-1,1,2,4,5,10};
		int[] results = mergeAndSortTwoArrays(input1, input2);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void mergeAndSortTwoArrays_testWorksWithFirstNullSecondNormal() throws Exception{
		int[] input1 = null;
		int[] input2 = new int[]{-1,4,10};
		int[] expected = new int[]{-1,4,10};
		int[] results = mergeAndSortTwoArrays(input1, input2);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void mergeAndSortTwoArrays_testWorksWithFirstEmptySecondNormal() throws Exception{
		int[] input1 = new int[0];
		int[] input2 = new int[]{-1,4,10};
		int[] expected = new int[]{-1,4,10};
		int[] results = mergeAndSortTwoArrays(input1, input2);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void mergeAndSortTwoArrays_testWorksWithFirstNormalSecondNull() throws Exception{
		int[] input2 = null;
		int[] input1 = new int[]{-1,4,10};
		int[] expected = new int[]{-1,4,10};
		int[] results = mergeAndSortTwoArrays(input1, input2);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void mergeAndSortTwoArrays_testWorksWithFirstNormalSecondEmpty() throws Exception{
		int[] input2 = new int[0];
		int[] input1 = new int[]{-1,4,10};
		int[] expected = new int[]{-1,4,10};
		int[] results = mergeAndSortTwoArrays(input1, input2);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void mergeAndSortTwoArrays_testWorksWithBothEmpty() throws Exception{
		int[] input2 = new int[0];
		int[] input1 = new int[0];
		int[] expected = new int[0];
		int[] results = mergeAndSortTwoArrays(input1, input2);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void mergeAndSortTwoArrays_testWorksWithFirstEmptySecondNull() throws Exception{
		int[] input1 = new int[0];
		int[] input2 = null;
		int[] expected = new int[0];
		int[] results = mergeAndSortTwoArrays(input1, input2);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test
	public void mergeAndSortTwoArrays_testWorksWithFirstNullSecondEmpty() throws Exception{
		int[] input2 = new int[0];
		int[] input1 = null;
		int[] expected = new int[0];
		int[] results = mergeAndSortTwoArrays(input1, input2);
		
		assertThat(results, is(equalTo(expected)));
	}
	
	@Test(expected = Exception.class)
	public void mergeAndSortTwoArrays_testWorksWithBothNull() throws Exception{
		mergeAndSortTwoArrays(null, null);
	}

}
