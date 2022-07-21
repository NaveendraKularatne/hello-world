package Operators;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Number 2: ");
        int num2 = scanner.nextInt();

        System.out.println("The result after performing num1 & num2 " + (num1 & num2));
        System.out.println("The result after performing num1 or num2 " + (num1 | num2));
    }
}
