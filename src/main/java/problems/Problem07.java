package problems;

public class Problem07
{
	public static void main(String [] args)
	{
		int primeCount = 0;
		int number = 3;

		while (primeCount < 10000)
		{
			int divider = 3;

			while (divider < number / 2)
			{
				if ((number % divider == 0)){
					number += 2;
					divider = 1;
				}

				divider += 2;
			}

			primeCount++;
			number += 2;
		}

		System.out.print(number - 2);
	}
}
