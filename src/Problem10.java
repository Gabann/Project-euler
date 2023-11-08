public class Problem10
{
	public boolean IsPrime(int input){
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
		Problem10 test = new Problem10();
		
		int target = 2000000;
		double total = 2;

		for (int i = 3; i <= target; i += 2)
		{
			if (test.IsPrime(i)){
				total += i;
			}
		}
		
		System.out.print(total);
	}
}
