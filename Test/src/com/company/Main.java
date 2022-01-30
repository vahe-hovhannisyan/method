package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(min(5, 1, 8));
        System.out.println(square(12));
        System.out.println(sum(4, 5, 6));

    }

    public static int min(int num, int num1, int num2) {
        int min;
        if (num <= num1 && num <= num2) {
            min = num;
        } else if (num1 <= num && num1 <= num2) {
            min = num1;
        } else{
            min = num2;
        }
        return min;
    }

    public static int square(int num) {
        return num * num;
    }
    public static int sum(int num, int num1, int num2){
        return num + num1 + num2;
    }
}
