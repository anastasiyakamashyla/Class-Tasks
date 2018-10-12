package by.task5;

public class Task5 {
	public static void main(String[] args) {
		Ball[] balls = createBalls();
		Basket basket = new Basket(balls);
		double totalWeight = calculateWeight(basket);
		System.out.println("totalWeight: " + totalWeight);
		int count = findCountOfSpecificColor(basket, "blue");
		System.out.println("count: " + count );
	}

	public static Ball[] createBalls() {
		Ball b1 = new Ball("blue", 1.0);
		Ball b2 = new Ball("red", 2.0);
		Ball b3 = new Ball("blue", 3.0);
		Ball b4 = new Ball("green", 4.0);
		Ball b5 = new Ball("blue", 5.0);

		Ball[] balls = new Ball[] { b1, b2, b3, b4, b5 };
		return balls;
	}

	public static double calculateWeight(Basket basket) {
		double totalweight = 0;
		Ball[] balls = basket.getBallArray();
		for (int i = 0; i < balls.length; i++) {
			Ball b = balls[i];
			double currw = b.getWeight();
			totalweight += currw;

			// totalweight += balls[i].getWeight();
		}
		return totalweight;
	}

	public static int findCountOfSpecificColor(Basket basket, String specificColor) {
		int count = 0;
		Ball[] balls = basket.getBallArray();
		for (int i = 0; i < balls.length; i++) {
			Ball b = balls[i];
			String color = b.getColor();
			
			if (specificColor.equals(color)) {
				count++;
			}
		}
		return count;
	}
}
