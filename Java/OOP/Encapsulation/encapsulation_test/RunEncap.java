package encapsulation_test;

public class RunEncap {
    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName("James");
        encap.setAge(28);
        System.out.println("Name " + encap.getName() + " and Age is " + encap.getAge() + ".");
    }
}
