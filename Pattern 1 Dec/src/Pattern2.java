import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n=sc.nextInt();
		
		int sp=0,st=n;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print("*");
			}
			if(i<=n/2)
			{
				sp++;
				st=st-2;
			}else {
				sp--;
				st=st+2;
			}
			System.out.println();
		}

	}

}
