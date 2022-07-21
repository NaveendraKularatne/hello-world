package Operators;

class InstanceOfOperator extends A{
    public static void main(String[] args) {
        InstanceOfOperator ob = new InstanceOfOperator();
        System.out.println("Is ob an InstanceOperator class? " + (ob instanceof A));
    }
}

class A{
    A(){
        System.out.println("This is class A");
    }
}