package task5;

import org.junit.Test;

import by.task5.Ball;
import by.task5.Basket;
import by.task5.Task5;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Task5Test {
	@SuppressWarnings("deprecation")
	@Test
	public void testCalculateWeight() {
		Ball[] balls = createTestBalls();
		Basket basket = new Basket(balls);
		
		double expectedWeight = 9;
		double realWeight = Task5.calculateWeight(basket);
		Assert.assertEquals(expectedWeight, realWeight);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testFindColor() {
		Ball[] balls = createTestBalls();
		Basket basket = new Basket(balls);
		
		int expectedCount = 4;
		int realCount = Task5.findCountOfSpecificColor(basket, "blue");
		Assert.assertEquals(expectedCount, realCount);
	}
	
	
	public static Ball[] createTestBalls(){
		Ball b1 = new Ball("blue", 1.0);
		Ball b2 = new Ball("blue", 1.0);
		Ball b3 = new Ball("blue", 2.0);
		Ball b4 = new Ball("green", 2.0);
		Ball b5 = new Ball("blue", 3.0);
		
		Ball[] balls = new Ball[] {b1, b2, b3, b4, b5};
				
		return balls;
	}

}

