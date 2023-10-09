package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int third) {
        if (left > right && left > third) {
            return left;
        } else if (right > left && right > third) {
            return right;
        } else {
            return third;
        }
    }

    public static int max(int left, int right, int third, int four) {
        if (left > right && left > third && left > four) {
            return left;
        } else if (right > left && right > third && right > four) {
            return right;
        } else if (third > left && third > right && third > four) {
            return third;
        } else {
            return four;
        }
    }
}