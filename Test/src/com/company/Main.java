package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(min(5, 1, 8) + " min ");
        System.out.println(square(12) + " square ");
        System.out.println(sum(4, 5) + " sum ");
        System.out.println(average(3, 7) + " average ");
        System.out.println(multiply(1, 5) + " multiply ");
        string(5, "Vahan");
        System.out.println( subract(7,4));
        System.out.println(factor(10,2));

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


    public static int sum(int num, int num1) {
        return num + num1;
    }


    public static int average(int num, int num1) {
        return sum(3,7)/ 2;
    }


    public static int multiply(int num, int num1) {
        return num * num1;
    }

    public static void string(int num, String string) {

        System.out.println(num + " " + string);
    }
    public static int subract(int num, int num1 ){
        return num - num1;
    }

    public static  int factor(int num, int num1){
        return num / num1;
    }

}


