import java.util.Scanner;
public class MultiOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			if(i%3==0)
				System.out.print(i+" ");
			i++;
		}
		System.out.println("thank you");

	}

}
