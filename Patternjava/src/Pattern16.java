import java.util.Scanner;
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
