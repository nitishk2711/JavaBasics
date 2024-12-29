import java.util.Scanner;
public class ProductDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int prod=1;
		
		while(n!=0)
		{
			int d=n%10;
			prod=prod*d;
			n=n/10;
		}
		System.out.println("product of the "+n+" is: "+prod);

	}

}
