package pl.vistula;

import java.util.Arrays;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        out.println("Result from task 1: " + generatorStrChar(5));
        out.println("Result from task 1: " + generatorStrChar(8));
        out.println();
        out.println("Result from task 2: The sum of the numbers in the array is: "  + calcSumArray(new int[]{12, -1, -21, -15, -12, -22, 5, -10, -3, -11, -4, -8, -18, 10, 8, 4, -16, -14, 18, -2, 16, 15, 69}));
        out.println();
        GenerateZeroSumArray generateZeroSumArray_1 = new GenerateZeroSumArray(23);
        GenerateZeroSumArray generateZeroSumArray_2 = new GenerateZeroSumArray(4);
        GenerateZeroSumArray generateZeroSumArray_3 = new GenerateZeroSumArray(4);
        out.println("Result from task 3: "  + generateZeroSumArray_1);
        out.println("Result from task 3: "  + generateZeroSumArray_2);
        out.println("Result from task 3: "  + generateZeroSumArray_3);
        out.println();
        out.println("Result from task 4: " + generatorLargestNumByFamily(456));
        out.println("Result from task 4: " + generatorLargestNumByFamily(6719));
        out.println("Result from task 4: " + generatorLargestNumByFamily(5960));
    }

    public static StringBuilder generatorStrChar(int n) {
        StringBuilder strChar = new StringBuilder();
        char firstChar = '+';
        char secondChar = '-';

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                strChar.append(firstChar);
            } else {
                strChar.append(secondChar);
            }
        }

        return strChar;
    }

    private static int calcSumArray(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    public static int generatorLargestNumByFamily(int n) {
        validateInput(n);

        String numStr = Integer.toString(n);

        char[] charArr = numStr.toCharArray();

        Arrays.sort(charArr);

        StringBuilder sortedStr = new StringBuilder(new String(charArr));
        sortedStr.reverse();

        return Integer.parseInt(sortedStr.toString());
    }

    public static void validateInput(int n) {
        if (n < 0 || n >= 10000) {
            throw new IllegalArgumentException("The parameter n must be between 0 ≤ n ≤ 10 000 .");
        }
    }
}