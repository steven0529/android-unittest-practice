package com.steven.androidunittestpractice;

/**
 * Created by steven on 8/13/16.
 */
public class Calculator {

    public static int addNumbers(int... numbers) {
        int finalNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            finalNumber += numbers[i];
        }
        return finalNumber;
    }

    public static int subtractNumber(int minuend, int... subtrahends) {
        int finalSubtrahend = 0;

        for (int i = 0; i < subtrahends.length; i++) {
            finalSubtrahend += subtrahends[i];
        }
        return minuend - finalSubtrahend;
    }
}
