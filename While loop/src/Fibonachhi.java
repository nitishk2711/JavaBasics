import java.util.Scanner;
public class Fibonachhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		
		int f=0,s=1,t=0;
		System.out.print(f+" ");
		System.out.print(s+" ");
		while(t<=n) {
			t=f+s;
			if(t<=n)
				System.out.print(t+" ");
				
			f=s;
			s=t;
		}

	}

}
