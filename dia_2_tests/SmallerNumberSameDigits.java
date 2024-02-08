package com.roshka.bootcamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SmallerNumberSameDigits {
    public static long nextSmaller(long n)
    {
        ArrayList<Integer> dynamicArray = new ArrayList<>();
        String strNumber = String.valueOf(n);
        int[] array = new int[strNumber.length()];
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(String.valueOf(strNumber.charAt(i)));
        }
        ArrayList<Integer> numbers = generateNumbers(array);   //random function to generate numbers from input;
        Collections.sort(numbers);


        int largestNumberLength = String.valueOf(numbers.get(numbers.size() - 1)).length();
        // Iterate over the list using iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer currentNum = iterator.next();
            int currentNumLength = String.valueOf(currentNum).length();
            if (currentNumLength < largestNumberLength) {
                iterator.remove();
            }
        }

        int index = numbers.indexOf(Integer.valueOf((int) n));
        if(index == 0){
            return -1;
        }
        return numbers.get(index-1);
    }



    public static  ArrayList<Integer> generateNumbers(int[] digits) {
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean[] used = new boolean[digits.length]; // Array to keep track of used digits
        generateNumbersHelper(digits, used, 0, 0, numbers);
        return numbers;
    }

    // Helper function for generating numbers recursively
    private static void generateNumbersHelper(int[] digits, boolean[] used, int index, int numberSoFar,  ArrayList<Integer> numbers) {
        // Base case: if we've reached the end of the digits array, add the numberSoFar to the list
        if (index == digits.length) {
            numbers.add(numberSoFar);
            return;
        }

        // Try appending each unused digit to the numberSoFar and recursively generate numbers
        for (int i = 0; i < digits.length; i++) {
            if (!used[i]) {
                used[i] = true; // Mark the digit as used
                generateNumbersHelper(digits, used, index + 1, numberSoFar * 10 + digits[i], numbers);
                used[i] = false; // Unmark the digit after backtracking
            }
        }
    }

    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the target number is found
            }
        }
        return -1; // Return -1 if the target number is not found in the array
    }
    public static void main(String[] args) {
        SmallerNumberSameDigits.nextSmaller(1027);
//        System.out.println(SmallerNumberSameDigits.nextSmaller(1027));

    }
}
