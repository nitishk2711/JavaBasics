import java.util.Scanner;
public class ConditionalBig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two integer number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int big=(a>b)?a:b;
		big=(big>c)?big:c;
		{
			System.out.println("biggest is: "+big);
		}
		
		
//		even or odd
		
//		String st=(a%2==0)?"even":"odd";
//		{
//			System.out.println(a+" is "+st);
//		}
//		
	}

}
