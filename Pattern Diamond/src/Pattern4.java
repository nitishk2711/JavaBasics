import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n=sc.nextInt();
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
