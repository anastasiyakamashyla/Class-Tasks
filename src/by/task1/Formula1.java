package by.task1;

import java.util.Scanner;

public class Formula1 {
	public static void main(String[] args) {
		double x = 0, y = 0, num = 0, den = 0, fx = 0;
		x = readDoubleFromConsole("Введите x: ");
		y = readDoubleFromConsole("Введите y: ");
		num = calcNum(x, y);
		den = calcDen(x, y);
		fx = calcFx(num, den);
		printResult(fx);

	}

	public static double calcNum(double x, double y) {
		double num;
		double sin = Math.sin(x + y);
		num = 1 + Math.pow(sin, 2);
		return num;
	}

	public static double calcDen(double x, double y) {
		
		double den, den2;
		den2 = 1 + Math.pow(x, 2) * Math.pow(y, 2);
		if (den2 != 0) {
			den = 2 + Math.abs(x - 2*x/den2);
		} else {
			System.out.println("«Знаменатель равен нулю");
			den = Double.NaN;
		}
		return den;
	}

	public static double calcFx(double Num, double Den) {
		double fx = 0;
		if (Den != 0) {
			fx = Num/Den;
		} else {
			System.out.println("«Знаменатель равен нулю");
			Den = Double.NaN;
		}
		return fx;
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

	public static void printResult(double fx) {
		System.out.println("Fx=" + fx);
	}

}
