package exceptions.sem1.ex05;

import java.util.Arrays;

class Answer {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(subArrays(new int[]{5, 5, 5}, new int[]{1, 1, 1, 1})));
    }

    public static int[] subArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        if (a.length != b.length) {
            return new int[0];
        }
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] - b[i];
        }
        return result;
    }
}