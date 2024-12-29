import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the valu epf n: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}

	}

}
