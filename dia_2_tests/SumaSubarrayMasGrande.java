package com.roshka.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class SumaSubarrayMasGrande {
    public static int maximoSubArray(int[] nums) {
        boolean allNegative = true;

        List<Integer> subArrayConMayorSuma = new ArrayList<>();
        int mayorSuma = 0;

        if (nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                allNegative = false;
            }
        }
        if(allNegative) {
            return 0;
            }
        for(int i = 0; i < nums.length; i++){
            List<Integer> subArrayConMayorSuma_aux = new ArrayList<>();
            subArrayConMayorSuma_aux.add(nums[i]);
            for(int j = i; j < nums.length; j++){
                if(j==i){
                    continue;
                }else{
                    subArrayConMayorSuma_aux.add(nums[j]);
                }
                int suma = sumDigits(subArrayConMayorSuma_aux);
                if(suma > mayorSuma){
                    mayorSuma = suma;
                    subArrayConMayorSuma = subArrayConMayorSuma_aux;
                }
            }
        }
        for(int l : subArrayConMayorSuma){
        System.out.print("\t"+l);
        }
        return mayorSuma;
    }

    public static int sumDigits(List<Integer> list) {
        int sum = 0;
        for (int number : list) {
            // Iterate through each digit of the number and add it to the sum
            while (number != 0) {
                sum += number % 10; // Add the last digit to the sum
                number /= 10; // Move to the next digit
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        System.out.println(  SumaSubarrayMasGrande.maximoSubArray(new int[] {1, -2, 3, -1, 5}));
        //System.out.println(  SumaSubarrayMasGrande.maximoSubArray(new int[] {}));
    }
}
