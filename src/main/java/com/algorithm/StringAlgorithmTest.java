package com.algorithm;

public class StringAlgorithmTest {

    public static String checkMatrix(String[] matrix){
        int n = matrix.length;
        int m = matrix[0].length();

        char[][] convertedMatrix = new char[n][m];
        for (int i = 0; i < n; i++) {
            convertedMatrix[i] = matrix[i].toCharArray();
        }

        if(checkHorizontal(convertedMatrix)) return "pass";

        // Dikey kuralı kontrol et
        if (checkVertical(convertedMatrix)) {
            return "pass";
        }

        // Sol diagonal kuralını kontrol et
        if (checkDiagonalLeft(convertedMatrix)) {
            return "pass";
        }

        // Sağ diagonal kuralını kontrol et
        if (checkDiagonalRight(convertedMatrix)) {
            return "pass";
        }

        // Hiçbir kural sağlanmazsa "fail" döndür
        return "fail";

    }

    private static boolean checkVertical(char[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 1; row < matrix.length; row++) {
                if (matrix[row][col] != matrix[0][col]) {
                    return false;
                }
            }
        }
        return true;
    }


    private static boolean checkDiagonalLeft(char[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][i] != matrix[0][0]) {
                return false;
            }
        }
        return true;
    }


    private static boolean checkDiagonalRight(char[][] matrix) {
        int cols = matrix[0].length;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][cols - 1 - i] != matrix[0][cols - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkHorizontal(char[][] matrix){
        for(char[] row : matrix){
            for(int i = 1; i < row.length; i++){
                if(row[i] != row[0]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] input1 = {"AA", "BB", "CC"};
        System.out.println(checkMatrix(input1)); // Çıktı: pass (yatay kural)

        String[] input2 = {"AB", "AB", "AB"};
        System.out.println(checkMatrix(input2)); // Çıktı: pass (dikey kural)

        String[] input3 = {"ABC", "CAB", "BCA"};
        System.out.println(checkMatrix(input3)); // Çıktı: pass (sol diagonal kural)

        String[] input4 = {"ABC", "BCA", "KAB"};
        System.out.println(checkMatrix(input4)); // Çıktı: fail (hiçbiri geçmedi)
    }
}
