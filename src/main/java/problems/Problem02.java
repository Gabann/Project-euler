package problems;

public class Problem02
{
	//Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with and , the first terms will be:
	//1,2,3,5,8,13,21,34
	//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

	public static void main(String[] args)
	{
		int current = 1;
		int previous = 1;
		int result = 0;

		while (current < 4000000)
		{
			if (current % 2 == 0)
			{
				result += current;
			}
			int temp = current;
			current += previous;
			previous = temp;
		}

		System.out.println(result);
	}
}
