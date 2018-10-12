package task1;

import org.junit.Test;

import by.task1.Formula;
import junit.framework.Assert;

public class FormulaTest {
	@SuppressWarnings("deprecation")
	@Test
	public void calcFx() {
		double Num = 1;
		double Den = 1;
		double realfx; 
		double expectedfx = 0.00990099;
		realfx = Formula.calcFx(Num, Den);
		Assert.assertEquals(expectedfx, realfx, 0.00000001);
	}
}
