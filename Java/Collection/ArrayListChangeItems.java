import java.util.ArrayList;

public class ArrayListChangeItems{
	
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Toyota");
		System.out.println(cars);
		cars.set(3, "Suzuki");
		System.out.println(cars);
}