import java.util.Scanner;

class MyClass{
	public static void main(String[] args){
	Scanner myObj = new Scanner(System.in);

	System.out.println("Enter your Name, Age and gpa:");

	String name = myObj.nextLine();
	int age = myObj.nextInt();
	double gpa = myObj.nextDouble();

	System.out.println("Name: " + name);
	System.out.println("Age: " + age);
	System.out.println("GPA: " + gpa);
	}
}