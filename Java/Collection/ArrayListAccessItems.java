import java.util.ArrayList;

public class ArrayListAccessItems{
	
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Toyota");
		System.out.println(cars);
		System.out.println(cars.get(0));
		System.out.println(cars.get(2));
	}
}