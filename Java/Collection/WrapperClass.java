import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WrapperClass{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random newRandom = new Random();

		int elements;

		System.out.println("How many items have you got to enter?");
		elements = sc.nextInt();

		for(int i = 0; i<elements; i++){
			System.out.println("Generating the number for the element of " + (i+1));
			numbers.add(newRandom.nextInt(50));
		}

		System.out.println(numbers);
	}
}