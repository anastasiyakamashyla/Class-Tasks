package by.task4;


import java.util.Arrays;
import java.util.Random;

public class Array {

	private static final int NUMBER = 1000;

    public static void main(String[] args) {
        int numOfElements = 10;
        int[] array = new int[numOfElements];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(NUMBER);
        }
        System.out.println(Arrays.toString(array)); 
        printPrimeNumbers(array);

    }

    public static void printPrimeNumbers(int[] array) {
        // iterating dividers
        for (int i = 0; i < array.length; i++) {
            if (findDividersNum(array[i])) {
                System.out.println(i + ": " + array[i]);
            }
        }
    }

    public static boolean findDividersNum(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

}