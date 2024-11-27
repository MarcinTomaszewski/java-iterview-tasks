package pl.vistula;

import java.util.*;

public class GenerateZeroSumArray {

    public static int[] generateUniqueZeroSum(int n) {
        validateInput(n);

        int[] result = new int[n];
        Set<Integer> usedNumbers = new HashSet<>();
        int sum = generateRandomNumbers(result, n, usedNumbers);

        result[n - 1] = generateLastNumber(-sum, usedNumbers, n);

        return result;
    }

    private static void validateInput(int n) {
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException("The parameter n must be between 1 and 100.");
        }
    }

    private static int generateRandomNumbers(int[] result, int n, Set<Integer> usedNumbers) {
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            int number = generateUniqueRandomNumber(random, usedNumbers, n);
            result[i] = number;
            usedNumbers.add(number);
            sum += number;
        }

        return sum;
    }

    private static int generateUniqueRandomNumber(Random random, Set<Integer> usedNumbers, int n) {
        int number;
        do {
            number = random.nextInt(2 * n + 1) - n;
        } while (usedNumbers.contains(number));
        return number;
    }

    private static int generateLastNumber(int lastNumber, Set<Integer> usedNumbers, int n) {
        Random random = new Random();
        while (usedNumbers.contains(lastNumber)) {
            lastNumber = random.nextInt(2 * n + 1) - n;
        }
        return lastNumber;
    }
}
