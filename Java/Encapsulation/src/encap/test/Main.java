package encap.test;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String baluNama;
        TestEncap newBalla = new TestEncap();

        System.out.println("Please enter a name for the dog: ");
        baluNama = sc.nextLine();

        newBalla.setBaluName(baluNama);
        System.out.println("Your dog's name is " + newBalla.getBaluName());
    }
}
