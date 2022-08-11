package methods;

public class Methods {
    static int plusMethodInt(int x, int y){
        return(x+y);
    }

    static double plusMethodDouble(double x, double y){
        return(x+y);
    }

    public static void main(String[] args) {
//        integer method
        System.out.println("Integer method: " + plusMethodInt(7, 8));

//        double method
        System.out.println("Double method: " + plusMethodDouble(7.15, 2.15));
    }
}
