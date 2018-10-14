package task1;

import org.junit.Test;

import by.task1.Formula1;
import junit.framework.Assert;


public class Formula1Test {

	@Test
	public void testCalcFxPositive() {
		double num = 1;
		double den = 1;
		double realfx; 
		double expectedfx = 2;
		realfx = Formula1.calcFx(num, den);
		Assert.assertEquals(expectedfx, realfx, 0.00000001);
	}
	
	
	@Test
	public void testCalcFxNegative() {
		double num = 1;
		double den = 0;
		double realfx; 
		double expectedfx = Double.NaN;
		realfx = Formula1.calcFx(num, den);
		Assert.assertEquals(expectedfx, realfx);
	}
	@Test
	public void testCalcDen() {
		double x = 1;
		double y = 1;
		double realden; 
		double expectedden = 2;
		realden = Formula1.calcDen(x, y);
		Assert.assertEquals(expectedden, realden, 0.00000001);
	}
}
