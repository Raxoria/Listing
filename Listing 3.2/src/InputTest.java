import java.util.*;

/**
 * This program demonstrate input.
 * @version 1.1 18 Maret 2021
 * @author Syelvie Ira
 */
public class InputTest 
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		//get first input
		System.out.print ("What is your name?");
		String name = in.nextLine();
		
		//get second input
		System.out.print ("How old are you?");
		int age = in.nextInt();
		
		//display output on console
		System.out.println("Hello, "+ name +". Next year, you'll be "+ (age+1));
	}
}
