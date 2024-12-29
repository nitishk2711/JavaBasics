import java.util.Scanner;
public class MainSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one integer number:");
		int n =sc.nextInt();
		
		int d1=n/10;
		int d2=n%10;
		int sum=d1+d2+d1*d2;
		if(n==sum) {
		System.out.println(n + " is the Special two digit number");
		}
		else
		{
			System.out.println(n + " is not a special two digit number");
		}

	}

}
