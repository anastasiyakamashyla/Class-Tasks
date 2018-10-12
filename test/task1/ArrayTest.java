package task1;
import org.junit.Test;

import by.task4.Array;
import junit.framework.Assert;

public class ArrayTest {
	@SuppressWarnings("deprecation")
	@Test
	public void testfindDividersNumTrue() {
		boolean expectedDivider = true;
		boolean realDivider = Array.findDividersNum(11);
	    Assert.assertEquals(expectedDivider, realDivider);
	}
	@Test
	public void testfindDividersNumFalse() {
		boolean expectedDivider = false;
		boolean realDivider = Array.findDividersNum(16);
	    Assert.assertEquals(expectedDivider, realDivider);
	}
}
