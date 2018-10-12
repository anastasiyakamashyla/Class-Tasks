package by.task1;

import java.util.Scanner;

public class Formula {
	public static void main(String[] args) {
		double x = 0, y = 0, Num = 0, Den = 0, fx = 0;

		x = readXFromConsole();
		y = readYFromConsole();
		calcNum(x, y);
		calcDen(x, y);
		fx = calcFx(Num, Den);
		printResult(fx);

	}

	public static double calcNum(double x, double y) {
		double Num;
		Num = 1 + Math.sin(x + y);
		return Num;
	}

	public static double calcDen(double x, double y) {
		
		double Den, den2;
		den2 = 1 + Math.pow(x, 2) * Math.pow(y, 2);
		if (den2 != 0) {
			Den = 2 + Math.abs(x - 2*x/den2);
		} else {
			System.out.println("Знаменатель равен нулю");
			Den = Double.NaN;
		}
		return Den;
	}

	public static double calcFx(double Num, double Den) {
		double fx = 0;
		if (Den != 0) {
			fx = Num/Den;
		} else {
			System.out.println("Знаменатель равен нулю");
			Den = Double.NaN;
		}
		return fx;
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

	public static void printResult(double fx) {
		System.out.println("Fx=" + fx);
	}

}
