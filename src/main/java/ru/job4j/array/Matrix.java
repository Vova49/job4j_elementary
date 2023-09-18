package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int sum = (i + 1) * (j + 1);
                array[j][i] = sum;

            }
        }
        return array;
    }
}
