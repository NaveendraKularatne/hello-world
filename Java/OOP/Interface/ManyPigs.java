interface Animal{
	public void animalSound();
}

interface FatAnimal{
	public void eat();
}

class Piggie implements Animal,FatAnimal{
	public void animalSound(){
		System.out.println("Piggie says: Wee wee");
	}
	public void eat(){
		System.out.println("Piggie eats");
	}
}

public class ManyPigs{
	public static void main(String[] args){
		Piggie myPig = new Piggie();
		myPig.animalSound();
		myPig.eat();
	}
}