package task2;

import org.junit.Assert;
import org.junit.Test;

import by.task2.Formula2;

public class Formula2Test {

	@Test
	public void testInBounds () {
		double x = 2;
		double y = 3;
		boolean realInBounds = Formula2.isInBounds(x, y);
		boolean expectedInBounds = true;
		Assert.assertEquals(expectedInBounds, realInBounds);
	}
	@Test
	public void testOutBounds () {
		double x = 9;
		double y = 8;
		boolean realInBounds = Formula2.isInBounds(x, y);
		boolean expectedInBounds = false;
		Assert.assertEquals(expectedInBounds, realInBounds);
	}
}
