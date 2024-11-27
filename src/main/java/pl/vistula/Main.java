package pl.vistula;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        out.println("Result from task 1: " + generatorStrChar(5));
        out.println("Result from task 1: " + generatorStrChar(8));
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
}