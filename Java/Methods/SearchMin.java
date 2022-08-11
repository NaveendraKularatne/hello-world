//Find the minimum number between 3 number inputs

import java.util.Scanner;

public class SearchMin{
	
	private static final Scanner scn = new Scanner(System.in);	

	static int min(int x1, int x2, int x3){
		return(Math.min(x3,(Math.min(x1,x2))));
	}

	public static void main(String[] args){
	int num1, num2, num3, num4;
	
	System.out.print("Enter the 1st number: ");
	num1 = scn.nextInt();
	System.out.print("Enter the 2nd number: ");
	num2 = scn.nextInt();
	System.out.print("Enter the 3rd number: ");
	num3 = scn.nextInt();

	System.out.println("Lowest number: " + min(num1, num2, num3));
	}
}