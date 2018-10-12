package by.task3;

import java.text.DecimalFormat;

public class Formula3 {
	public static void main(String[] args) {
		int a = 0;
		int b = 10;
		int h = 1;
		int x;
		double fx; // функция от x
		DecimalFormat df = new DecimalFormat("###.####");
		for (x = a; x <= b; x += h) {
			fx = 2 * Math.tanh(x);
			System.out.println(" _____" + "  ______");
			System.out.println("|" + x + "    |" + "|" + df.format(fx) + "|");
			System.out.println(" _____" + "  ______");
            
		}

	}
}
