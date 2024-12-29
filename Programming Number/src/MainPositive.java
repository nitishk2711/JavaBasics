import java.util.Scanner;
public class MainPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one integer number: ");
		int n=sc.nextInt();
		if(n<0)
		{
			n=n*-1;
		}
		System.out.println("user entered number is: "+n);

	}

}
