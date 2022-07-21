package Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5, num3 = 1, res;
        boolean flag = true;
        char character = 'a';

        res = +character;
        System.out.println("The + operator on character transform it to ASCII value " + res);
        num3 = -num3;
        System.out.println("The - operator on num1 positive value " + num3);

        num1++;
        res = num1;
        System.out.println("1.The res = num1++ returned value of " + res);
//        int test = res;
//        System.out.println("2.The res = num1++ returned value of " + test);
        res = ++num1;
        System.out.println("The res = ++num1 returned value of num1  " + res);

        num2--;
        res = num2;
        System.out.println("Output of num-- is " + res);
        System.out.println("Output of --num is "+ --num2);

        System.out.println("Not operator returns the value of " + !flag);
    }
}
