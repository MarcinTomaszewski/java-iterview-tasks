package pl.vistula;

import java.util.*;

import static java.lang.System.*;
import static pl.vistula.GenerateZeroSumArray.generateUniqueZeroSum;

public class Main {
    public static void main(String[] args) {
        out.println("Result from task 1: " + generatorStrChar(5));
        out.println("Result from task 1: " + generatorStrChar(8));
        out.println("The sum of the numbers in the array is: "  + calcSumArray(new int[]{8,1,2,3,4}));
        out.println("Result from task 2: "  + Arrays.toString(generateUniqueZeroSum(23)));
        out.println("Result from task 2: "  + Arrays.toString(generateUniqueZeroSum(4)));
        out.println("Result from task 2: "  + Arrays.toString(generateUniqueZeroSum(4)));
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