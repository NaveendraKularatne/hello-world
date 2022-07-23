// Abstract class
abstract class Animal{
    public abstract void animalSounds();    // Abstract method (A method without a body)
    public void sleep(){                    // Regular method (Inclded here to show that abstract classes can have regular methods also)
        System.out.println("Sleeping...zzz");
    }

}

// Sub-class
class Pig extends Animal{
    public void animalSounds(){
        System.out.println("The pig makes the sound : wee wee");
    }
}

class Main{
    public static void main(String[] args) {
        Pig newPig = new Pig();
        newPig.sleep();
        newPig.animalSounds();
    }
}

