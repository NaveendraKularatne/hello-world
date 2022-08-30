import java.util.ArrayList;

class ArrayListSize{
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Nissan");
		cars.add("Toyota");
		cars.add("Mercedes");
		System.out.println(cars);
		System.out.println(cars.size());

		for(int i = 0; i < cars.size(); i++){
			System.out.println(cars.get(i));
		}
	}
}