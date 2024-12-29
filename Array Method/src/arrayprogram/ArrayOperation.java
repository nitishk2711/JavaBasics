package arrayprogram;
import java.util.Scanner;

public class ArrayOperation {
	
	int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an Array: ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter"+ n +"values:");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	
	public void dispArray(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	
	public int[] merge(int[] a, int[] b)
	{
		int[] c=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		return c;
	}
	
 
}
