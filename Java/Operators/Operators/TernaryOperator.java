package Operators;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Enter number 1 :");
        int num1 = scann.nextInt();
        System.out.println("Enter number 2 :");
        int num2 = scann.nextInt();

        String result = (num1 <= num2) ? "num1 is lower than or equal to num2": "num2 is lower than num1";
        System.out.println(result);
    }
}
