package utils;

import java.math.BigInteger;

public class Utils
{
	public static boolean isPrime(int number)
	{
		for (int i = 3; i < number; i+= 2)
		{
			if (number % i == 0)
			{
				return false;
			}
		}

		return true;
	}

	public static boolean isPrime(double number)
	{
		for (double i = 3; i < number; i+= 2)
		{
			if (number % i == 0)
			{
				return false;
			}
		}

		return true;
	}

	public static boolean isPalindrome(BigInteger number)
	{
		if (number.toString().length() % 2 != 0)
		{
			return false;
		}

		int j = number.toString().length() - 1;


		for (int i = 0; i < number.toString().length(); i++)
		{
			if (number.toString().charAt(i) != number.toString().charAt(j))
			{
				return false;
			}

			j--;
		}

		return true;
	}
}
