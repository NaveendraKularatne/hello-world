import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        num2 = scanner.nextInt();

        System.out.println("(" + num1 + " > 4)"+ " && " + "(" + num2 + " < 9) is: " + (num1>4 && num2<9));
    }
}
