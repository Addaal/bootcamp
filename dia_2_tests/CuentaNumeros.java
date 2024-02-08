package com.roshka.bootcamp;

import java.util.*;
public class CuentaNumeros {

    public static List<Long> findAll(final int sumDigits, final int numDigits) {
        List<Long> longList = new ArrayList<>();
        List<Long> longListFiltered = new ArrayList<>();
        List<Long> longListAnswer = new ArrayList<>();
        int upperNum = 9;
        int lowerNum = 1;

        //create limits
        for (int i = 0; i < numDigits-1; i++) {
            upperNum = upperNum * 10 + 9;
            lowerNum = lowerNum * 10;
        }

        //ieterates
        for(int i =lowerNum; i < upperNum+1; i++) {
            int sumOfDigits = sumDigits(i);

            if (sumOfDigits == sumDigits) {
                longList.add((long) i);
            }
        }

        System.out.println("upperNum: " + upperNum);
        System.out.println("LoweNum: " + lowerNum);

        if(longList.size() > 0) {
            longListFiltered = filterByOrderedNumbers(longList);
            longListAnswer.add((long) longListFiltered.size());
            longListAnswer.add(longListFiltered.get(0));
            longListAnswer.add(longListFiltered.get(longListFiltered.size() - 1));
        }

        if(!longListAnswer.isEmpty()){
        return longListAnswer;
        }
        return new ArrayList<Long>();
    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static List<Long> filterByOrderedNumbers(List<Long> longList) {
        List<Long> longListOrdered = new ArrayList<>();

        for(int i = 0; i < longList.size(); i++) {
            boolean DesiredNumber = true;
            String strNumber = String.valueOf(longList.get(i));
            for(int j = 1; j < strNumber.length(); j++) {
                int numericValue = Character.getNumericValue(strNumber.charAt(j));
                int PreviousNumericValue = Character.getNumericValue(strNumber.charAt(j-1));
                if(numericValue < PreviousNumericValue){
                    DesiredNumber = false;
                }
            }
            if(DesiredNumber) {
                longListOrdered.add(longList.get(i));
            }
        }

        return longListOrdered;
    }
    public static void main(String[] args) {
        List<Long> longList = findAll(84, 4);
        for(int i = 0; i < longList.size(); i++)
        {
            System.out.print("\t" + longList.get(i));
        }
    }

}
