import java.util.ArrayList;

public class ArrayListRmAll{
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Volvo");
		cars.add("Toyota");
		cars.add("Nissan");
		cars.add("Mercedes");
		System.out.println(cars);
		cars.clear();		
		System.out.println(cars);
	}
}