import java.util.Scanner;
public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digit: ");
		int n=sc.nextInt();
		int sum=0;
		
		while(n!=0) 
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("sum of the digit is: "+sum);

	}

}
