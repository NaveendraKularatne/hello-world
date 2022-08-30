import java.util.Collections;
import java.util.ArrayList;

public class ArrayListSort{
	public static void main(String[] args){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(15);
		numbers.add(54);
		numbers.add(97);
		numbers.add(7);
		System.out.println(numbers);

		Collections.sort(numbers);
		System.out.println(numbers);
	}
}