
import java.util.Scanner;
public class CalculateSum {
	
	static int SumOfArray(int x[])
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int arr[]= {45,55,89,32,28};
		int sm=SumOfArray(arr);
		
		System.out.println("sum of the array element: "+sm);

	}

}
