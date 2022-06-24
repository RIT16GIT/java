package JavaBasic;

public class Constructorwiththiskeyword {
	
	String name;
	int age;
	
	
	public Constructorwiththiskeyword(String name,int age) {
		this.name =name;
		this.age =age;
		
	   System.out.println(name);
	   System.out.println(age);
	   
	}

	public static void main(String[] args) {
		
		Constructorwiththiskeyword obj = new Constructorwiththiskeyword("Tom",32);

	}

}
