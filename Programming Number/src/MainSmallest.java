import java.util.Scanner;
public class MainSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three digit number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int small=a;
		
		if(b<small)
		{
			small=b;
		}if(c<small)
		{
			small=c;
		}
		System.out.println("smallest number is: "+small);

	}

}
