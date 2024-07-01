package problems;

import utils.Utils;

import java.math.BigInteger;

public class Problem04
{
	//A palindromic number reads the same both ways. The largest palindrome made from the product of two -digit numbers is 9009 = 91 * 99
	//Find the largest palindrome made from the product of two 3-digit numbers.

	public static void main(String[] args)
	{
		BigInteger i = new BigInteger("999");
		BigInteger j = new BigInteger("999");
		BigInteger result;

		while (true)
		{
			BigInteger product = i.multiply(j);

			if (Utils.isPalindrome(product))
			{
				result = product;
				break;
			}

			i = i.subtract(BigInteger.ONE);
			j = j.subtract(BigInteger.valueOf(2));
		}

		System.out.println(result);
	}
}
