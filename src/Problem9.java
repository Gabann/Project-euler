public class Problem9
{
	public static void main(String[] args)
	{
		int a,b,c;
		
		int targetNumber = 1000;

//		System.out.print((int)sqrt(targetNumber));

		for (int i = 1000; i >= 3; i--)
		{
			c = i;

			for (int j = c - 1; j >= 3; j--)
			{
				b = j;

				for (int k = b - 1; k >= 3; k--)
				{
					a = k;
					
					if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2))
					{
						if (a + b + c == targetNumber){
							System.out.print("a " + a + " b " + b + " c " + c);
							System.out.print("\n" + a * b * c);
						}
					}
				}
			}
		}
	}
}
