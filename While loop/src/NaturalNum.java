import java.util.Scanner;
public class NaturalNum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range: ");
		int n=sc.nextInt();
		 int i=1;
		 
		 while(i<=n)
		 {
			 System.out.print(i+" ");
			 i++;
		 }
		 System.out.println("thank you");
	}
}