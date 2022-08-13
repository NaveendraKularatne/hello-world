package encapsulation.test;

public class RunEncap {
    public static void main(String[] args) {
        EncapTest encap = new EncapTest();

        encap.setAge(28);

        System.out.println(encap.getAge());
    }
}
