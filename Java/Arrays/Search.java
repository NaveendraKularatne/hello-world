import java.util.Scanner;

class Search{
	static Scanner scanner = new Scanner(System.in);
	static int length;
	static int check;

	public static void main(String[] args){
		System.out.print("What is the expected length of array: ");
		length = scanner.nextInt();

		//Initializing array
		int[] number= new int[length];

		//Inserting values
		for(int x = 0; x < length; x++){
			System.out.println("Enter value " + (x+1) + ":");
			number[x] = scanner.nextInt();
		}

		//Checking wether the value is inside of the array
		while(true){
		System.out.print("Enter the value you want to check : ");
		check = scanner.nextInt();

			for(int y = 0 ; y < length; y++){
				if(number[y]==check){
					System.out.println("Entered number " + check + " is in the array.");
					break;
				}else{
					System.out.println("Entered number " + check + " is not in the array." );
				}
			}		
		}
	}
}