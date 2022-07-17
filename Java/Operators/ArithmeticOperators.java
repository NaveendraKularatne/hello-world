import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int add, sub, mul;
        double div, mod;
        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        num1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        num2 = scanner.nextInt();

        add = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        System.out.println("Addition of two numbers: " + add);
        System.out.println("Subtraction of two numbers: " + sub);
        System.out.println("Multiplication of two numbers: " + mul);
        System.out.println("Division of two numbers: " + div);
        System.out.println("Modulus of two numbers: " + mod);
    }
}
