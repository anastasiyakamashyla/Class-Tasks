package by.task2;

import java.util.Scanner;

public class Formula2 {
	public static void main(String[] args) {
		boolean result;
		double x = 0, y=0;
		x = readXFromConsole();
		y = readYFromConsole();
		result = isInBounds(x, y);
		printResult(result);

	}

	public static boolean isInBounds(double x, double y) {
		
		int X1 = 4, X2 = 6, Y1 = 5, Y2 = -3;

		if (x <= X1 && x >= 0 && y <= Y1 && y >= 0) {
			return true;
		}

		if (x <= X1 && x >= 0 && y >= Y2 && y <= 0) {
			return true;
		}

		return false;
	}
	public static double readYFromConsole() {
		Scanner sc = new Scanner(System.in);
		double y = 0;

		System.out.println("Введите y: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Введите y: ");
		}
		y = sc.nextDouble();
		return y;
	}

	public static double readXFromConsole() {
		Scanner sc = new Scanner(System.in);
		double x = 0;

		System.out.println("Введите x: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Введите x: ");
		}
		x = sc.nextDouble();
		return x;
	}

	public static void printResult(boolean result) {
		System.out.println("Point is in bounds:" + result);
	}
}