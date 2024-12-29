import java.util.Scanner;
public class MainEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one integer number: ");
		int a=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("enter number is even number ");
		}else
		{
			System.out.println("enter number is odd number");
		}

	}

}
