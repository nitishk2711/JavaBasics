import java.util.Scanner;
public class PerfectNum {
	
	static boolean isPerfect(int x) {
		int sum=0;
		for(int i=1;i<=x/2;i++) {
			if(x%i==0)
				sum=sum+i;
		}
		return sum==x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		
		boolean rs=isPerfect(n);
		if(rs==true)
			System.out.println(n+" is a perfect number");
		else
			System.out.println(n+" is not perfect number");
		

	}

}
