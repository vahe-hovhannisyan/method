package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(min(5, 1, 8) + " min ");
        System.out.println(square(12) + " square ");
        System.out.println(sum(4, 5, 6) + " sum ");
        System.out.println(average(3,7,9) + " average ");
        System.out.println(multiple(1,5,-4) + " multiple ");

    }

    public static int min(int num, int num1, int num2) {
        int min;
        if (num <= num1 && num <= num2) {
            min = num;
        } else if (num1 <= num && num1 <= num2) {
            min = num1;
        } else {
            min = num2;
        }
        return min;
    }

    public static int square(int num) {
        return num * num;
    }

    public static int sum(int num, int num1, int num2) {
        return num + num1 + num2;
    }
    public static int average(int num, int num1, int num2){
        return (num + num1 + num2) / 3;
    }
    public static int multiple(int num, int num1, int num2){
        return num * num1 * num2;
    }

} 
