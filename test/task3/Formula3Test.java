package task3;
import org.junit.Assert;
import org.junit.Test;


import by.task3.Formula3;

public class Formula3Test {
	
	@Test
	public void testCalcFx() {
		double x = 3;
		double realY = Formula3.calcFx(x);
		double expectedY = 0.9951;
		Assert.assertEquals(expectedY, realY,  0.0001);
	}
}
