package pl.vistula;

import java.util.*;

public class GenerateZeroSumArray {
    private final int[] result;
    private final int n;
    private final Set<Integer> usedNumbers = new HashSet<>();
    private final Random random = new Random();

    public GenerateZeroSumArray(int n) {
        this.result = new int[n];
        this.n = n;
        generateUniqueZeroSum();
    }

    @Override
    public String toString() {
        return "GenerateZeroSumArray{" +
                "result=" + Arrays.toString(result) +
                '}';
    }

    public void generateUniqueZeroSum() {
        validateInput(n);

        int sum = generateRandomNumbers();

        result[n - 1] = generateLastNumber(-sum);
    }

    private void validateInput(int n) {
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException("The parameter n must be between 1 and 100.");
        }
    }

    private int generateRandomNumbers() {
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            int number = generateUniqueRandomNumber();
            result[i] = number;
            usedNumbers.add(number);
            sum += number;
        }

        return sum;
    }

    private int generateUniqueRandomNumber() {
        int number;
        do {
            number = random.nextInt(2 * n + 1) - n;
        } while (usedNumbers.contains(number));
        return number;
    }

    private int generateLastNumber(int lastNumber) {
        while (usedNumbers.contains(lastNumber)) {
            lastNumber = random.nextInt(2 * n + 1) - n;
        }
        return lastNumber;
    }
}
