package challenge;

/**
 * This class was designed to help test your skills manipulating arrays. I've
 * created method skeletons for you. Your mission is to write the code that does
 * what the comments ("javadocs") tell it to do. You'll know you succeeded if
 * all of your unit tests pass. Good luck!
 * 
 * @author chriskrone
 * 
 */
public class ArrayChallenge1 {

	/**
	 * This method should take an array of integers, and return the sum of that
	 * array
	 * 
	 * @param numbers
	 *            the integer array
	 * @return the sum of all of the integers in the array
	 * @throws Exception
	 *             if for some reason we can't sum the array provided
	 */
	public static int findSum(int[] numbers) throws Exception {
		// here we are handling error conditions

		if (numbers == null || numbers.length == 0) {
			// we have nothing to do if the array is null or there are no
			// numbers in the array
			// so throw an exception to yell at the user!
			throw new Exception("Bad input, bro!");
		}
		// initialize our "sum" variable
		int sum = 0;

		// this for loop is identical to (but simpler than)
		// "for(int i = 0 ; i < numbers.length ; i++){"
		// except it automatically assigns numbers[i] to a variable called num
		for (int num : numbers) {
			// add the number to the sum

			// this is identical to (but simpler than) "sum = sum + num;"
			sum += num;
		}

		// return the results!
		return sum;
	}

	/**
	 * This method should take an array of integers, and return the average
	 * (mean) of that array
	 * 
	 * @param numbers
	 *            the integer array
	 * @return the average (mean) of all of the integers in the array
	 * @throws Exception
	 *             if for some reason we can't find the average of the array
	 *             provided
	 */
	public static double findAverage(int[] numbers) throws Exception {
		// here we are handling error conditions

		if (numbers == null || numbers.length == 0) {
			// we have nothing to do if the array is null or there are no
			// numbers in the array
			// so throw an exception to yell at the user!
			throw new Exception("Bad input, bro!");
		}
		// initialize "sum" variable
		double sum = 0;
		double average = 0;

		for (double num : numbers) {
			// add the number to the sum
			sum += num;
		}

		average = (sum / numbers.length);
		// return the results!
		return (double) average;
	}

	/**
	 * Reverses the order of an array
	 * 
	 * @param numbers
	 *            the integer array
	 * @return the same array, but in reverse order
	 * @throws Exception
	 *             if for some reason we can't reverse the array provided
	 */
	public static int[] reverseArray(int[] numbers) throws Exception {
		// TODO - write some code here, homey!
		if (numbers == null || numbers.length == 0) {
			// we have nothing to do if the array is null or there are no
			// numbers in the array
			// so throw an exception to yell at the user!
			throw new Exception("Bad input, bro!");
		}

		int length = numbers.length;

		for (int i = 0; i < length / 2; i++) {

			int placeHolder = numbers[length - (1 + i)];

			numbers[length - (1 + i)] = numbers[i];

			numbers[i] = placeHolder;
		}

		return numbers;
	}

	/**
	 * Changes all of the elements in an array to whatever the biggest one is
	 * 
	 * @param numbers
	 *            the integer array
	 * @return an array where all of the numbers have been changed to whatever
	 *         the biggest one is
	 * @throws Exception
	 *             if for some reason we can't change the numbers
	 */
	public static int[] changeAllToBiggest(int[] numbers) throws Exception {
		// TODO - write some code here, homey!
		// hint: Math.max(num1, num2) will return the bigger of the two numbers!

		if (numbers == null || numbers.length == 0) {

			throw new Exception("Bad input, bro!");
		}

		double getToTheBiggestNumbah = Double.POSITIVE_INFINITY * -1;

		for (int num : numbers) {

			if (num > getToTheBiggestNumbah) {
				getToTheBiggestNumbah = num;
			}

		}
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) getToTheBiggestNumbah;

		}

		return numbers;
	}

}
