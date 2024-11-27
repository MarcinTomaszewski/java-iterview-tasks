package pl.vistula;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        out.println("Result from task 1: " + generatorStrChar(5));
        out.println("Result from task 1: " + generatorStrChar(8));
        out.println("The sum of the numbers in the array is: "  + calcSumArray(new int[]{12, -1, -21, -15, -12, -22, 5, -10, -3, -11, -4, -8, -18, 10, 8, 4, -16, -14, 18, -2, 16, 15, 69}));
        GenerateZeroSumArray generateZeroSumArray_1 = new GenerateZeroSumArray(23);
        GenerateZeroSumArray generateZeroSumArray_2 = new GenerateZeroSumArray(4);
        GenerateZeroSumArray generateZeroSumArray_3 = new GenerateZeroSumArray(4);
        out.println("Result from task 3: "  + generateZeroSumArray_1);
        out.println("Result from task 3: "  + generateZeroSumArray_2);
        out.println("Result from task 3: "  + generateZeroSumArray_3);
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
}