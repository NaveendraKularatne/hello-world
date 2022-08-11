import java.util.Scanner;

public class JavaMethodReturn{

	private static Scanner sc = new Scanner(System.in);

	static int x ,y;

	static int returnAddition(int x , int y){
		return(x + y);
	}

	public static void main(String[] args){
		System.out.println("Please enter the two numbers to add: ");
		x = sc.nextInt();
		y = sc.nextInt();

		int z = returnAddition(x, y);
		System.out.println("Addition of " + x + " and " + y + " is: " + z);
	}	
}