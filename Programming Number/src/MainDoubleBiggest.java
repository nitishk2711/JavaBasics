import java.util.Scanner;
public class MainDoubleBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter double type number: ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double big=a;
		
		if(b>big)
		{
			big=b;
		}if(c>big)
		{
			big=c;
		}
		System.out.println("biggest double value is: "+big);

	}

}
