final class Vehicle{
	protected String brand = "Volvo";
	public void honk(){
		System.out.println("Beep Beep");
	}
}

class Car extends Vehicle{
	String modelName = "Volvo XC40 Recharge";
}

public class Volvo{
	public static void main(String[] args){
		Car myCar = new Car();
		System.out.println("Brand of my car is " + myCar.brand);
		System.out.println("Model is " + myCar.modelName);
		myCar.honk();
	}
}