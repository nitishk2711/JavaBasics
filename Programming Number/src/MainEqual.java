import java.util.Scanner;
public class MainEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two integer number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a==b)
		{
			System.out.println("both number are equal");
		}else
		{
			System.out.println("both number are not equal");
		}

	}

}
