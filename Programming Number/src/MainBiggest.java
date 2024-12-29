import java.util.Scanner;
public class MainBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three digit value: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int big=a;
		if(b>big) 
		{
			big=b;
		}if(c>big)
		{
			big=c;
		}
		System.out.println("biggest value is: "+big);
	}

}
