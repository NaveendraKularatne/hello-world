public class TestOfEncapsulation {
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        age = newAge;
    }
    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public static void main(String[] args) {
        TestOfEncapsulation newTest = new TestOfEncapsulation();
        newTest.setAge(28);
        newTest.setName("Naveendra");

        System.out.println(newTest.getAge() + " " + newTest.getName());
    }
}
