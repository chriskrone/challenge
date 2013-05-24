package challenge;

/**
 * This class was designed to help test your skills manipulating arrays. I've created method skeletons for you.
 * Your mission is to write the code that does what the comments ("javadocs") tell it to do.
 * You'll know you succeeded if all of your unit tests pass. Good luck!
 * @author chriskrone
 *
 */
public class ArrayChallenge1 {

	/**
	 * This method should take an array of integers, and return the sum of that array
	 * @param numbers the integer array
	 * @return the sum of all of the integers in the array
	 * @throws Exception if for some reason we can't sum the array provided
	 */
public static int findSum(int[] numbers) throws Exception{
		
import java.util.Scanner;

public class sketch
{

public static void main(String args[])
	{
        	int sum = 0;
        	int b = 0;
       	 
        	Scanner Keyboard = new Scanner(System.in);
       	 
        	int[] number = new int[4];
       	 
        	for (int i = 0; i <=3; i++)
        	{
                	System.out.println("enter a number to be summed");
               	 
                	number[i] = Keyboard.nextInt();
            	}
        	for (int j=0; j <= 3; j++)
        	{
           	 
            	b = number[j];
            	sum = b + sum;
           	 
        	}
        	System.out.println("the sum of the numbers is " + sum);
    	}
	}

		return -1;
	}
	
	/**
	 * This method should take an array of integers, and return the average (mean) of that array
	 * @param numbers the integer array
	 * @return the average (mean) of all of the integers in the array
	 * @throws Exception if for some reason we can't find the average of the array provided
	 */
public static double findAverage(int[] numbers) throws Exception{
	
public class sketch
{

public static void main(String args[])
	{
        	double sum = 0;
        	double b = 0;
        	double average = 0;
        	Scanner Keyboard = new Scanner(System.in);
       	 
        	double[] number = new double[4];
       	 
        	for (int i = 0; i <=3; i++)
        	{
                	System.out.println("enter a number to be averaged with its kin");
               	 
                	number[i] = Keyboard.nextInt();
               	 
            	}
        	for (int j=0; j <= 3; j++)
        	{
           	 
            	b = number[j];
            	sum = b + sum;
           	 
        	}
        	average = sum / 4;
        	System.out.println("the average of the numbers is " + average);
    	}
	}

		//hint: you're probably going to have to cast some ints as doubles!
		return -1;
	}
	
	
	public static int[] reverseArray(int[] numbers) throws Exception{
	
public class sketch
{

public static void main(String args[])
	{
        	double sum = 0;
        	double a = 0;
        	double b = 0;
        	double average = 0;
       	 
        	Scanner Keyboard = new Scanner(System.in);
       	 
        	double[] number = new double[4];
       	 
        	for (int i = 0; i <=3; i++)
        	{
                	System.out.println("enter a number to be entered into the flippy floppy 9000");
               	 
                	number[i] = Keyboard.nextDouble();
               	 
        	}
        	int c = number.length;
        	int d = (c-1) / 2;
       	 
     	 
       	 
        	for (int i = 0; i <= d; i++)
        	{
            	a = number[i];
            	b = number[((c-1)-i)];
            	number[i] = b;
            	number[((c-1)-i)] = a;
        	}
   	 
    	for (int i = 0; i <= (c - 1); i++)
    	{
       	 
        	System.out.println(number[i]);
    	}
   	 
	}
}

		return null;
	}
	
	/**
	 * Changes all of the elements in an array to whatever the biggest one is
	 * @param numbers the integer array
	 * @return an array where all of the numbers have been changed to whatever the biggest one is
	 * @throws Exception if for some reason we can't change the numbers
	 */
	public static int[] changeAllToBiggest(int[] numbers) throws Exception{
		//TODO - import java.io.*;
import java.util.Scanner;

public class javaDoodles
{

public static void main(String args[])
    {
            int sum = 0;
            int b = 0;
         
            Scanner Keyboard = new Scanner(System.in);
         
            int[] number = new int[4];
            int tracker = 0;
            int c = number.length;
            for (int i = 0; i <=3; i++)
            {
                    System.out.println("enter a number to be summed");
                 
                    number[i] = Keyboard.nextInt();
                }
            for (int j=0; j <= 3; j++)
            {
             
                 if (number[j] >  tracker)
                     {
                         tracker = number[j];
             
            }
           
        }
        for (int i = 0; i <= 3; i++)
        {
            number[i] = tracker;
    }
    
    for (int i = 0; i <= (c - 1); i++)
    	{
       	 
        	System.out.println(number[i]);
    	}
    }
}

		//hint: Math.max(num1, num2) will return the bigger of the two numbers!
		return null;
	}

}
