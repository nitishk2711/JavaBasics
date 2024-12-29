import java.util.Scanner;
public class NumberN_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range: ");
		int n=sc.nextInt();
		
		while(n>=1)
		{
			System.out.print(n+" ");
			n--;
		}
		System.out.println("thank you");

	}

}
