import java.util.Scanner;
public class Plaindrome {
	static boolean isPlaindrome(int x)
	{
		int rev=0,temp=x;
		do {
			int r=x%10;
			rev=rev*10+r;
			x=x/10;
		}while(x!=0);
		return rev==temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		
		boolean rs=isPlaindrome(n);
		
		if(rs==true)
			System.out.println(n+" is a plaindrome number");
		else
			System.out.println(n+" is a not plaindrome number");

	}

}
