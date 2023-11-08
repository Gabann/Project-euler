import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class Problem10Test
{

	@Test
	void testPrime()
	{
		var problem10 = new Problem10();
		assertTrue(problem10.IsPrime(3));
		assertTrue(problem10.IsPrime(5));
		assertTrue(problem10.IsPrime(5839));
		assertTrue(problem10.IsPrime(7907));

		assertFalse(problem10.IsPrime(2));
		assertFalse(problem10.IsPrime(705));
		assertFalse(problem10.IsPrime(5000));
	}
}