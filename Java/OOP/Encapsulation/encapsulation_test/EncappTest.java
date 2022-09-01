public class EncappTest{
	private String name;
	private int age;

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public void setName(String newName){
		this.name = newName;
	}

	public void setAge(int newAge){
		this.age = newAge;
	}

	public static void main(String[] args){
		EncappTest newChild = new EncappTest();
		newChild.setName("Naveendra");
		newChild.setAge(28);
		System.out.println("Name of the student is " + newChild.getName() + " and Age of the student is " + newChild.getAge() + ".");
	}
}