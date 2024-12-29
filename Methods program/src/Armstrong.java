import java.util.Scanner;
public class Armstrong {
	
	static boolean isArmstrong(int x) {
		int sum=0,temp=x;
		do {
			int r=x%10;
			sum=sum+r*r*r;
			x=x/10;
		}while(x!=0);
		return sum==temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		
		boolean rs=isArmstrong(n);
		if(rs==true)
			System.out.println(n+" this is Armstrong number");
		else
			System.out.println(n+" this is not a Armstrong number");
		

	}

}
