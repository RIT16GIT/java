package JavaBasic;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistconcept {

	public static void main(String[] args) {
		
		LinkedList<String> mm = new LinkedList<String>();
		
		
		mm.add("Neha");
		mm.add("QTP");
		mm.add("Selenium");
		
		System.out.println(mm);
		
		//add
		mm.addFirst("Ram");
		mm.addLast("Leela");
		System.out.println("Content of String:" + mm);
		
		
		
		//remove
		mm.removeFirst();
		mm.removeLast();
		System.out.println("Content of String:" + mm);
		
		//get
		System.out.println(mm.get(1));
		
		//set
		mm.set(1, "Rampi");
		System.out.println(mm.get(1));
		
		System.out.println("............");
		
		//for loop
		for(int n =0;n<mm.size();n++) {
			 System.out.println(mm.get(n));
		}	 
		
		System.out.println("for advanceloop........");
		
		for(String str : mm) {
			System.out.println(str);
		}
		
		System.out.println("for iterator........");

		
		//iterator
		Iterator<String> it = mm.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		
		 System.out.println("..........");
		 int num=0;
		 while(mm.size()>num) {
			 System.out.println(mm.get(num));
			 num++;
		 }
		
	}

}
