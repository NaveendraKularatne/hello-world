public class Animal{
	void animalSound(){
		System.out.println("Animal make sounds");
	} 
}

class Pig extends Animal{
	void animalSound(){
		System.out.println("Pig says: oink");
	}
}

class Main{
	public static void main(String[] args){
		Animal newAnimal = new Animal();
		newAnimal.animalSound();
		
	}
}