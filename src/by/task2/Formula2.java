package by.task2;

import java.util.Scanner;

public class Formula2 {

	public static void main(String[] args) {
		boolean result;
		double x = 0, y=0;
		x = readDoubleFromConsole("¬ведите x: ");
		y = readDoubleFromConsole("¬ведите y: ");
		result = isInBounds(x, y);
		printResult(result);

	}

	public static boolean isInBounds(double x, double y) {
		
		int X1 = -6, X2 = -4, X3 = 4, X4= 6, Y1 = -3, Y2 = 5; 

		if (x >= X2 && x <= X3 && y >= 0 && y <= Y2) {
			return true;
		}

		if (x >= X1 && x <= X4 && y >= Y1 && y <= 0) {
			return true;
		}

		return false;
	}
	
	public static double readDoubleFromConsole(String text) {
		Scanner sc = new Scanner(System.in);
		double x = 0;

		System.out.println(text);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println(text);
		}
		x = sc.nextDouble();
		return x;
	}

	public static void printResult(boolean result) {
		System.out.println("Point is in bounds:" + result);
	}
}