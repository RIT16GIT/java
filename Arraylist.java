package JavaBasic;

import java.util.ArrayList;
import java.util.Iterator;



public class Arraylist {

	public static <E> void main(String[] args) {
		
	
		
		ArrayList<Integer> ar =new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		System.out.println(ar);
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		
		//for loop
		
		for(int i=0 ;i<(ar.size()); i++) {
			System.out.println(ar.get(i));
		}
       
		ArrayList<E> ar1 =new ArrayList<E>();
		
		ArrayList<String> ar2 =new ArrayList<String>();
		 ar2.add("Selenium");
		 System.out.println(ar2);
		
		 Employee e1 = new Employee("Neha",24,"QA");
		 Employee e2 = new Employee("Sonam",25,"DEV");
		 Employee e3 = new Employee("Swati",26,"BA");
		 
		 ArrayList<Employee> ar4 = new ArrayList<Employee>();
		 ar4.add(e1);
		 ar4.add(e2);
		 ar4.add(e3);
		 
		 Iterator<Employee> it = ar4.iterator();
		 while(it.hasNext()){
		 Employee emp = it.next();
		 System.out.println(emp.name);
		 System.out.println(emp.age);
		 }
		  
		 
		System.out.println("...........");
		
		//add(All)
		
		ArrayList<String> ar5 =new ArrayList<String>();
		ar5.add("Java");
		ar5.add("Selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Cucumber");
		ar6.add("testing");
		ar6.add("Maven");
		
		ar5.addAll(ar6);
		
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
			System.out.println("...........");
			//remove(all)
			
			ar5.removeAll(ar6);
			for(int i=0; i<ar5.size(); i++){
			System.out.println(ar5.get(i));
			
			}
			
			System.out.println(".........");
			
			//retainall(common on both)
			ArrayList<String> ar7 = new ArrayList<String>();
			ar7.add("Maven");
			ar7.add("grdle");
			
			ar6.retainAll(ar7);
			for(int i=0;i<ar6.size();i++) {
				System.out.println(ar6.get(i));
			
			}
			
		}

	}


