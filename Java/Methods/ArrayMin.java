//Find the minimum number in the array

class ArrayMin{
	static int lowestValue(int[] arr){
		int temp = arr[0];

		for(int x = 1; x < arr.length ; x++){
			if(arr[x]<temp){
				temp = arr[x];
			}
		}
		return temp;
	}

	public static void main(String[] args){
		int[] numbers = {15, 50, 78, 5, 12, 458, 50};

		System.out.println("Minimum of the array: " + lowestValue(numbers));

	}
}