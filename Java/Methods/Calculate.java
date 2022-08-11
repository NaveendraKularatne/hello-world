//Calculating the sum of the digits in an integer

class Calculate{
	
	static int calculateSum(int targetInt){
		int sum = 0;

		while(targetInt > 0){
			sum = sum + targetInt%10;
			targetInt = targetInt/10;
		}
		return sum;
	}

	public static void main(String[] args){
		int thisNum = 45182;

		System.out.println("Sum of the entered integer: " + calculateSum(thisNum));
	}
}