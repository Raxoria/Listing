import java.math.*;
import java.util.*;
/**
 * This program uses big numbers to compute the odds of winning the grand prize in a lottery
 * @version 1.1 25 Maret 2021
 * @author Syelvie Ira
 */
public class SixthTry 
{
	public static void main (string[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("How many numbers do you nee to draw");
		int k = in.nextInt();
		
		System.out.print("What is the highest number you can draw?");
		int n = in.nextInt();
		
		/*
		 * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
		 */
		
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		
		for (iny i = 1; i <= k; i++)
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(
				   BigInteger.valueOf(i));
		
		System.out.println("Your odds are 1 in " + lotteryOdds + ". Good Luck!");
	}
}
