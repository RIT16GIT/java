package JavaBasic;

public class LoopConcept {

	public static void main(String[] args) {
		
		//while loop
		
		int i = 1;//intillastion 
		while (i<=10) { //condition part
			System.out.println(i);
			i=i+1;
		}
		 System.out.println("********");
		 
        //for loop (1 to 10)
		 for(int j=1 ; j<=10 ; j++) {//intallisation conditional increment
			 System.out.println(j);
		 }
		 
		 System.out.println("********");
		//10 to 1
		 for(int k=10 ; k>=1 ; k--) {
			 System.out.println(k);
		 }
		 
		 System.out.println("********");
		 //post increment 
		 int d=1;
		 int e=d++;
		 
		 System.out.println(d);
		 System.out.println(e);
		 
		 System.out.println("********");
		 
		//pre increment 
		 
		 int f=1;
		 int g=++f;
		 
		 System.out.println(f);
		 System.out.println(g);
		 
		 System.out.println("********");
		 
		 //post decrement
		 int h=2;
		 int l=h--;
		 
		 System.out.println(h);
		 System.out.println(l);
		 
		 System.out.println("********");
		 
		//post decrement
		 int m=2;
		 int n=--m;
		 
		 System.out.println(m);
		 System.out.println(n);
	}


}
