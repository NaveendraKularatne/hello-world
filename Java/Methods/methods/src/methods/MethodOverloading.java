package methods;

public class MethodOverloading {
    static int plusMethod(int x, int y){
        return(x + y);
    }
    static double plusMethod(double x, double y){
        return(x + y);
    }

    public static void main(String[] args) {
        System.out.println("Integer: " + plusMethod(5, 6));
        System.out.println("Double: " + plusMethod(5.75, 4.25));
    }
}
