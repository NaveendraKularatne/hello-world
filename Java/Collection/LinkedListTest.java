import java.util.LinkedList;

public class LinkedListTest{
	public static void main(String[] args){
		LinkedList<String> myCar = new LinkedList<String>();
		myCar.add("Volvo");
		myCar.add("Toyota");
		myCar.add("Mercedes");
		myCar.add("Suzuki");

		System.out.println(myCar);
	}	
}