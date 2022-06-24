package JavaBasic;

public class Array {

	public static void main(String[] args) {
		int i [] = new int[4];
		   i[0]=10;
		   i[1]=20;
		   i[2]=30;
		   i[3]=40;
		System.out.println(i[1]);
		
		System.out.println(i.length);// size of array
		
		for(int j=0; j<i.length; j++)// to print all values of array at a time
		{
			System.out.println(i[j]);
		}
		
		int f[][] = new int[1][2];
		   f[0][0]=67;
		   f[0][1]=20;
		   
		   char h[][]=new char[1][2];
		     h[0][0]='A';
		     h[0][1]='m';
		     
		
		
		   System.out.println(f[0][0]);
		   System.out.println(f[0][1]);
		   System.out.println(h[0][0]);
		   System.out.println(h[0][1]);

		
	}

}
