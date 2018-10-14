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
	@Test
	public void testrunFxBLessA() {
		double a = 9;
		double b = 3;
		double h = 1;
		int realFx = Formula3.runFxFromAtoB(a, b, h);
		int expectedFx = -1;
		Assert.assertEquals(expectedFx, realFx);
	}
	@Test
	public void testrunFxBEqualsA() {
		double a = 3;
		double b = 3;
		double h = 1;
		int realFx = Formula3.runFxFromAtoB(a, b, h);
		int expectedFx = -1;
		Assert.assertEquals(expectedFx, realFx);
	}
	@Test
	public void testrunFxHInvalid() {
		double a = 3;
		double b = 9;
		double h = 0;
		int realFx = Formula3.runFxFromAtoB(a, b, h);
		int expectedFx = -2;
		Assert.assertEquals(expectedFx, realFx);
	}
}
