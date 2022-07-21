package Operators;

public class ShiftOperator {
    public static void main(String[] args) {
        int num1 = 10;

        System.out.println("The result after performing left shift : " + (num1 << 2 ));
        System.out.println("The result after performing right shift : " + (num1 >> 2));
        System.out.println("The result after performing right unsigned shift : " + (num1 >>> 2));

    }
}
