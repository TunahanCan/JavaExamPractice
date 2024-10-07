package com.algorithm;

public class ReverseString {

    public static String reverseString(String input ,int k) {
        char[] chars = input.toCharArray();
        for(int i = 0 ; i < chars.length ; i+= 2*k) {
            int end = Math.min(i + k -1 , chars.length -1) ;
            reverseFunctions(chars, i,end);
        }
        return new String(chars);
    }

    private static void reverseFunctions(char[] chars, int start, int end) {
        while (start<end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        int k = 3;
        String result = reverseString(str, k);
        System.out.println(result);
    }
}
