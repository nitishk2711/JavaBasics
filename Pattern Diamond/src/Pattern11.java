import java.util.Scanner;
public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int x=i;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(x);
				if(j<i)
					x--;
				else
					x++;
			}
			System.out.println();
		}

	}

}
