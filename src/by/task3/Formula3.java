package by.task3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Formula3 {
	public static void main(String[] args) {
		double a = readFromConcole("Введите a:");
		double b = readFromConcole("Введите b:");
		double h = readFromConcole("Введите h:");
		int checkRun = runFxFromAtoB(a, b, h);
		if (checkRun == -1) {
			System.out.print("Верхняя граница должна быть меньше нижней границы диапазона");
		}
		if (checkRun == -2) {
			System.out.print("Шаг должен быть больше нуля");
		}
	}

	public static int runFxFromAtoB(double a, double b, double h) {
		double x;
		double fx;
		if (a >= b) {
			return -1;
		}
		if (h <= 0) {
			return -2;
		}
		for (x = a; x <= b; x += h) {
			fx = calcFx(x);
			printResult(x, fx);
		}
		return 0;
	}

	private static double readFromConcole(String printLine) {
		double number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print(printLine);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Ошибка формата - " + printLine);
		}
		number = sc.nextDouble();
		return number;
	}

	public static double calcFx(double x) {
		double fx = Math.tanh(x);
		return fx;
	}

	private static void printResult(double x, double fx) {
		System.out.println("-----------------------");
		System.out.println("| x=" + String.format("%.4f|", x) + "f(x)=" + String.format("%.4f", fx) + "|");
		System.out.println("-----------------------");

	}

}
