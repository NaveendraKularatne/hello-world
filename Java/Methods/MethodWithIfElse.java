import java.util.Scanner;

class MethodWithIfElse{
	
	private final static Scanner sc = new Scanner(System.in);
	static int Age = 0;

	static void checkAge(int age){
		if(age<=18){
			System.out.println("You are under-age, hence not eligible.");
		}else{
			System.out.println("You have access.");
		}
	}

	public static void main(String[] args){
		while(true){
			System.out.print("Enter your age : ");
			Age = sc.nextInt();

			checkAge(Age);
		}
	}
}