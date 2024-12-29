import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Array1st {
	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the size of array: ");
//		int n=sc.nextInt();
//		int ar[]=new int[n];
//		System.out.println("enter"+ n +"integer: ");
//		
//		
//		for(int i=0;i<ar.length;i++)
//		{
//			ar[i]=sc.nextInt();
//		}
//		System.out.println("user entered values: ");
//		
//		
//		for(int i=0;i<ar.length;i++)
//		{
//			System.out.print(ar[i]+" ");
//		}
//	}
		

		public static void main(String[] args) { ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(1);

		arrayList.add((int) 'c');

		arrayList.add(Integer.valueOf("1"));

		Collections.sort(arrayList);

		System.out.println(arrayList);

		

		}

}
