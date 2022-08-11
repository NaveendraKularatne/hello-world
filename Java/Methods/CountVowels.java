//Count all the vowels in a String

import java.util.Scanner;


public class CountVowels{
	static int countVowels(String para){
	int count = 0;

	for(int i = 0; i< para.length() ; i++){
		if(para.charAt(i) == 'a' || para.charAt(i) == 'e' || para.charAt(i) == 'i' || para.charAt(i) == 'o' || para.charAt(i) == 'u'){
			count += 1;
		}
	}
	return count;	
}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String line = sc.nextLine();

		System.out.println("Number of vowels in the string you entered: " + countVowels(line));
	}
}