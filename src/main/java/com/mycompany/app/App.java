package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
     public static void main(String[] args) {
        System.out.println("Maven 4tw!");
        int sum = addTwoNumbers(4,5);
        int multiply = multiplyTwoNumbers(9,7);
        System.out.println(sum);
        System.out.println(multiply);
    }


    public static int addTwoNumbers(int a,int b){
        return a+b;
    }

    public static int multiplyTwoNumbers(int a,int b){
        return a*b;
    }
}
