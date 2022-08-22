interface Animal{
	public void animalSound();
	public void sleep();
}

class Piggie implements Animal{
	public void animalSound(){
		System.out.println("Piggie says: Wee wee");
	}
	public void sleep(){
		System.out.println("Piggie sleeps");
	}
}

public class Pig{
	public static void main(String[] args){
		Piggie myPig = new Piggie();
		myPig.animalSound();
		myPig.sleep();
	}
}