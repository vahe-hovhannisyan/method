package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(min(1, 5, 7));
    }

    public static int min(int num, int num1, int num2) {
        int min = 0;
        if (num <= num1 && num <= num2) {
            min = num;
        } else if (num1 <= num && num1 <= num2) {
            min = num1;
        } else if (num2 <= num && num2 <= num1) {
            min = num2;
        }
        return min;
    }
}
