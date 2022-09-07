 class Adder{
	 int add(int a, int b){
		return a+b;
	}

	 int add(int a, int b, int c){
		return a+b+c;
	}
}
class TestOverload{
	public static void main(String[] args){
		Adder addThis = new Adder();
		System.out.println(addThis.add(11,11));
		System.out.println(addThis.add(11,11,11));
	}
}