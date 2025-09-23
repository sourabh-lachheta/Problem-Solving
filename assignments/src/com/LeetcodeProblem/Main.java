package com.LeetcodeProblem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int result = sum(num1, num2);
        System.out.print("Answer is : " + result);
    }
    static int sum(int a, int b){
        return a + b;
    }
}
