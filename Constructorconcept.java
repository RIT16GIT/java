package JavaBasic;

public class Constructorconcept {
	
	public Constructorconcept() {
		System.out.println("default constructor");
	}

	public Constructorconcept(int i) {
		System.out.println("one parameter constructor");
	}

	public Constructorconcept(int i ,int j) {
		System.out.println("two parameter constructor");
		System.out.println("the value of i "+ i);
		System.out.println("the value of j " +j);
	}

	public static void main(String[] args) {
		
		Constructorconcept obj = new Constructorconcept();
		Constructorconcept obj1 = new Constructorconcept(10);
		Constructorconcept obj2 = new Constructorconcept(10,20);
		
		
		
		

	}

}
