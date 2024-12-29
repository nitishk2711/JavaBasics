
import java.util.Scanner;
public class Average {
	
	static double averageOfArr(double x[])
	{
		double avg=0;
		double sum=0;
		for(int i=0;i<x.length;i++)
		{
			
			sum=sum+x[i];
			avg=sum/(x.length);
		}
		return avg;
	}

	public static void main(String[] args) {
		
		double arr[]= {45.0,55.5,89.7,32.7,28.0};
		double rs=averageOfArr(arr);
		
		System.out.println("average of the array element: "+rs);

	}

}
