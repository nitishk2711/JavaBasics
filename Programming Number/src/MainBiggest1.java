import java.util.Scanner;
public class MainBiggest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter fout digit value: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int big=a;
		
		if(b>big)
		{
			big=b;
		}if(c>big) 
		{
			big=c;
		}if(d>big)
		{
			big=d;
		}
		System.out.println("biggest number is: "+big);

	}

}
