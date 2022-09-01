public class EncapsulationTest{
	private String name;
    private int age;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setName(String newName){
        this.name = newName;
    }
    public static void main(String[] args) {
        EncapsulationTest encap = new EncapsulationTest();
        encap.setName("James");
        encap.setAge(28);
        System.out.println("Name " + encap.getName() + " and Age is " + encap.getAge() + ".");
    }
}