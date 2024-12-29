import java.util.Scanner;
public class Special2no {
	
	static boolean isSpecial(int x) {
		int d1=x/10, d2=x%10;
		int sum=d1+d2+d1*d2;
		return sum==x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		
		boolean rs=isSpecial(n);
		if(rs==true)
			System.out.println(n+" is a Special two number");
		else
			System.out.println(n+" is a not two Special method");
		

	}

}
