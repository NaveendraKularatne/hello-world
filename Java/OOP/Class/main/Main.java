 package main;

public class Main {
    public static void main(String[] args) {
        Dog huntingDog = new Dog();

        //Access field
        System.out.println(huntingDog.legs);

        //Access methods
        huntingDog.barking();
    }
}
