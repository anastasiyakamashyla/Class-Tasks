package task1;

import org.junit.Test;

import by.task1.Formula1;
import junit.framework.Assert;

public class FormulaTest {
	@SuppressWarnings("deprecation")
	@Test
	public void testCalcFxPositive() {
		double Num = 1;
		double Den = 1;
		double realfx; 
		double expectedfx = 1;
		realfx = Formula1.calcFx(Num, Den);
		Assert.assertEquals(expectedfx, realfx, 0.00000001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalcFxNegative() {
		double Num = 1;
		double Den = 0;
		double realfx; 
		double expectedfx = Double.NaN;
		realfx = Formula1.calcFx(Num, Den);
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
