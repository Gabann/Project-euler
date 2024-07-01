package problems;

public class Problem10
{
	public static boolean isPrime(int input){
		if (input % 2 == 0){
			return false;
		}

		for (int i = 3; i < input / 2; i+= 2)
		{
			if (input % i == 0){
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args)
	{

		int target = 200000;
		double total = 2;

		for (int i = 3; i <= target; i += 2)
		{
			if (isPrime(i)){
				total += i;
			}
		}

		System.out.print(total);
	}
}
