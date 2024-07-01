package problems;

public class Problem01
{
	//If we list all the natural numbers below that are multiples of or , we get and . The sum of these multiples is
	//Find the sum of all the multiples of 3 or 5 below 1000

	static int[] dividers = {3,5};
	static int limit = 1000;

	public static void main(String[] args)
	{
		int result = 0;

		for (int i = 0; i < limit; i++)
		{
			for (int number : dividers)
			{
				if (i % number == 0)
				{
					result += i;
					break;
				}
			}
		}

		System.out.println(result);
	}
}
