package org.geekbrains;

import java.util.Arrays;

public class HW36 {
    int[] arr2;

//    public static void main(String[] args) {
//    }

    public int[] afterFour(int[] arr1, int a) throws RuntimeException {
        int x = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == a) {
                x = i;
            }
        }
        if (x > -1) {
            System.out.println("индекс числа " + a + " = " + x);
            arr2 = Arrays.copyOfRange(arr1, x + 1, arr1.length);
            System.out.print("Полученный массив: ");
            for (int i : arr2) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
        if (arr2 == null) {
            throw new RuntimeException("В массиве нет четверок!");
        } else {
            return arr2;
        }
    }

    public boolean oneAndFour2(int[] arr, int a, int b) {
        boolean x1 = false;
        boolean x2 = false;
        for (int j : arr) {
            if (j == a || j == b) {
                if (j == a) {
                    x1 = true;
                } else if (j == b) {
                    x2 = true;
                }
            } else {
                return false;
            }
        }
        return x1 & x2;
    }
}
