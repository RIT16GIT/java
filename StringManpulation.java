package JavaBasic;

public class StringManpulation {

	public static void main(String[] args) {
		
		String str ="The rains have started heres";
		String str1 ="The rains Have started heres";
		
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(8));
		
		System.out.println(str.indexOf('s'));
		
		
		System.out.println(str.indexOf('s',str.indexOf('s')+1));
		
		System.out.println("******");
		
	//for multiple occurrence
		
		int i = str.indexOf('s');
		while(i >= 0) {
		     System.out.println(i);
		     i = str.indexOf('s', i+1);
		}
		
		System.out.println("******");
		
		System.out.println(str.indexOf("have"));
		
		System.out.println(str.indexOf("Hello"));
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.substring(0, 8));
		
		String s = "   Hello World   ";
		
		System.out.println(s.trim());
		
		System.out.println(s.replace(" ", ""));
		
		String date ="17-2-2012";
		
		System.out.println(date.replace("-", "/"));
		
		String test ="Hello_World_Of_Selenium";
		
		String testval[] = test.split("_");
		
		for(int j=0 ;j<testval.length;j++) {
		
		System.out.println(testval[j]);
		
		}
		
		String s2 ="cares";
		System.out.println(s2.concat("d"));
	}

}
