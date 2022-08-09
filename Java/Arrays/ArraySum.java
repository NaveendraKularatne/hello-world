import java.text.DecimalFormat;
import java.util.Scanner;

public class ArraySum {

    //To round off the double average value
    private static final DecimalFormat df = new DecimalFormat("0.00");
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int lengthOfArray = 0;
        int sum = 0;
        double average = 0;

        System.out.println("Please enter the number of elements: ");
        lengthOfArray = scanner.nextInt();
        int[] numbers = new int[lengthOfArray];

        //Taking values in
        for(int i=0; i<lengthOfArray; i++){
            System.out.println("Enter number " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for(int i = 0; i<lengthOfArray; i++){
            sum += numbers[i];
        }
        System.out.println("Length of the array: " + numbers.length);
        System.out.println("Sum of the array elements is: " + sum);

        // Calculating average
        average = (double)sum / (numbers.length);
        System.out.println("Average is: " + df.format(average));
    }
}
