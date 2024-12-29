import java.util.Scanner;
public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range: ");
		int n=sc.nextInt();
//		int i=1;
		/*
		while(i<=n)
		{
			if(i%2==0)
			System.out.print(i+" ");
			i++;
		}
		*/
		
		int i=2;
		while(i<=n)
		{
			System.out.print(i+" ");
			i=i+2;
		}
		System.out.println("thank you");

	}

}
