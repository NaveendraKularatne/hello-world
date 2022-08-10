import java.util.Arrays;

class ArraySort{
	public static void main(String[] args){
		int[] numbers = {13, 45, 86, 12, 17, 85};

		System.out.println("Before sorting.");

		for(int x: numbers){
			System.out.println(x);
		}

		Arrays.sort(numbers);
		System.out.println("After sorting.");

		for(int i: numbers){
			System.out.println(i);
		}
	}
}