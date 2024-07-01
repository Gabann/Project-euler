import problems.Problem10;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
class Problem10Test
{
	@Test
	void testIsPrime()
	{
		assertTrue(Problem10.isPrime(3));
		assertTrue(Problem10.isPrime(5));
		assertTrue(Problem10.isPrime(5839));
		assertTrue(Problem10.isPrime(7907));

		assertFalse(Problem10.isPrime(2));
		assertFalse(Problem10.isPrime(705));
		assertFalse(Problem10.isPrime(5000));
	}
}
