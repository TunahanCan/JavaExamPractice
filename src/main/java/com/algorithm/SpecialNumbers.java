package com.algorithm;

public class SpecialNumbers {

    //1331
    public static boolean controlForPalidromNumber(int number){
        String originalNumber = String.valueOf(number);
        String reversedNumber = new StringBuilder(originalNumber).reverse().toString();
        return originalNumber.equals(reversedNumber);
    }


    //153
    public static boolean controlForArmstrongNumber(int number){
        int orginalNumber = number;
        int counter = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (number != 0){
            int lastDigit = number%10;
            counter += (int) Math.pow(lastDigit,numberOfDigits);
            number /= 10;
        }
        return orginalNumber == counter;
    }

    public static String controlForFibonacciNumber(int value){
        if(value < 0) return "";
        StringBuilder result = new StringBuilder();
        int a = 0, b = 1;
        result.append(a).append(" ").append(b).append(" ");
        for(int i = 2; i < value; i++){
            int counter = a + b;
            result.append(counter).append(" ");
            a = b ;
            b = counter;
        }
        return result.toString();
    }

    public static boolean controlForPrimeNumber(int number){
        if(number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long reverseNumber(long number){
        long reversedNumber = 0;
        while (number != 0){
            int digit = (int) (number % 10);
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}
