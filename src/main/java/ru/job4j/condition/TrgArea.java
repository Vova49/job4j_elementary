package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = a + b + c;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        double rsl = s;
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}