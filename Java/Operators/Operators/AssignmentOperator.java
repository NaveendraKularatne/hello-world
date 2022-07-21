package Operators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AssignmentOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Enter variable number: ");
        int variable = scanner.nextInt();

        num += variable;
        System.out.println("Output after +=  is: " + num);
        System.out.println("Output after -=  is: " + (num -= variable));
        System.out.println("Output after *=  is: " + (num *= variable));
        System.out.println("Output after /=  is: " + (num /= variable));
        System.out.println("Output after %=  is: " + (num %= variable));

    }

}
