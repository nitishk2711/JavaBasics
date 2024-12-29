import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		int x=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(x+" ");
				x++;
				if(x==10)
					x=1;
			}
			System.out.println();
		}

	}

}
