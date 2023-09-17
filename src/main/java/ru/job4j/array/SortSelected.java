package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, data[i] - 1, data.length - 1);
            int index = FindLoop.indexInRange(data, min, data[i] - 1, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }
}