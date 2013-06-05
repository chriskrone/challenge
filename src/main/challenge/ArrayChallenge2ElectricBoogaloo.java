package challenge;

public class ArrayChallenge2ElectricBoogaloo {

	/**
	 * This method should take an array of integers, and return the biggest
	 * difference between any two of them.
	 * 
	 * @param numbers
	 *            the integer array
	 * @return the biggest difference between any two numbers
	 * @throws Exception
	 *             if for some reason we can't find the biggest difference
	 */
	public static int findBiggestDifference(int[] numbers) throws Exception {
		return -1;
	}

	/**
	 * This method should take an array of integers, and return a count of the
	 * number of instances of the given number
	 * 
	 * @param numbers
	 *            the array of integers
	 * @param num
	 *            the number to count
	 * @return the count of that number
	 * @throws Exception
	 *             if for some reason we can't process the array given
	 */
	public static int countInstancesOfANumber(int[] numbers, int num)
			throws Exception {
		return -1;
	}

	/**
	 * This method should take two unsorted arrays of integers, and return one
	 * array that is both of those two arrays merged AND sorted!
	 * 
	 * If one of the arrays is empty or null, it should just return the other
	 * array sorted! If they are both empty, it should return an empty array. If
	 * one is empty and one is null, it should return an empty array. If they
	 * are both null, it should throw an exception.
	 * 
	 * @param numbers1
	 *            the first integer array
	 * @param numbers2
	 *            the second integer array
	 * @return an array that is combination of the other two arrays sorted
	 * @throws Exception
	 *             if for some reason we can't merge the given arrays
	 */
	public static int[] mergeAndSortTwoArrays(int[] numbers1, int[] numbers2)
			throws Exception {
		return null;
	}

	/**
	 * This method should take an array of integers, and return an array of
	 * three integers from the first array that sum zero, or null if no three of
	 * the elements sum up to zero! An exception should be thrown for any array
	 * that can't be processed.
	 * 
	 * Example 1: If you get passed [1, 3, 0, 5, -4, 2, -1, -3], you could
	 * return [3, 0, -3] or [5, -4, -1] or [1, 0, -1] or [-4, 3, 1]... any of
	 * those are fine and the order you return the numbers in doesn't matter.
	 * 
	 * Example 2: If you get passed [1, 5, 0, 3, 4], you would return null
	 * (because no three of those numbers add up to zero
	 * 
	 * Example 3: If you get passed null or [] or [1] or [1, -1], you would
	 * throw an Exception telling the user what they did wrong.
	 * 
	 * Warning: This one is pretty hard to do well!
	 * 
	 * @param numbers
	 *            the array of integers
	 * @return a new integer array that contains three numbers from the first
	 *         array that add up to zero
	 * @throws Exception
	 *             if for some reason we can't process the array given
	 */
	public static int[] find3NumbersThatSumZero(int[] numbers) throws Exception {
		return null;
	}

}
