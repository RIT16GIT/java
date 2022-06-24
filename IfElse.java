package JavaBasic;

public class IfElse {

	public static void main(String[] args) {
		int a = 200;
		int b = 300;
		int c = 400;
		
		if(a>b & a>c){
			System.out.println("A is greater");
		}
		else if(b>c){
			System.out.println("B is greater");
		}
		else {
			System.out.println("C is greater");
		}
	}

}
