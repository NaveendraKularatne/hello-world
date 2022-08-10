import java.util.Arrays;

class JABS{
	public static void main(String[] args){
		int arr[] = {12,45,8,78,46,5};

		int element = 46;
		System.out.println("Index of " + element + " is: " + Arrays.binarySearch(arr, element));

		//Array to String
		String sample = Arrays.toString(arr);
		System.out.println("After converting to String : " + sample);
	}
}