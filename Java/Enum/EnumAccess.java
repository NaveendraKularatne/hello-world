enum Level{
	LOW, 
	MEDIUM,
	HIGH
}

public class EnumAccess{
	public static void main(String[] args){
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);
	}
}