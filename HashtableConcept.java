package JavaBasic;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		 h.put("A",100);
		 h.put("B",200); 
		 h.put(1,500); 
		 
		 System.out.println(h.size());
		 System.out.println(h.get(1));
		 
		 h.put("C","Sam");
		 
		 System.out.println(h.get("C"));
		 
		 Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		   h1.put(1,3);
		   h1.put(3,10);
		   
           System.out.println(h1.get(3));
           
           
           Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
		   h2.put(4,"Ram");
		   h2.put(3,"Dam");
		   h2.put(5,"Ham");
		   
		   System.out.println(h2.get(5));
	}

}
