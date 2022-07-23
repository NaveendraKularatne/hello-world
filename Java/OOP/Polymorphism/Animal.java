class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The Pig says: wee wee");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The Dog says: bow wow");
    }
}

class Main{
    public static void main(String[] args) {
        Animal newAnimal = new Animal();
        Animal newPig = new Pig();
        Animal newDog = new Dog();

        newAnimal.animalSound();
        newPig.animalSound();
        newDog.animalSound();
    }
}