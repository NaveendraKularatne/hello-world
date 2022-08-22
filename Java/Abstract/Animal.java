abstract class AnimalVoice{
	public abstract void animalSound();
	public void sleep(){
		System.out.println("Zzz");
	}
}

class Pig extends AnimalVoice{
	public void animalSound(){
		System.out.println("Pig says: Wee wee");	
	}
}

public class Animal{
	public static void main(String[] args){
		Pig myPig = new Pig();
		myPig.sleep();
		myPig.animalSound();
	}
}