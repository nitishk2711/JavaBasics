import java.util.Scanner;
public class Accending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three integer value: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		int big=(a>b)?a:b;
		big=(big>c)?big:c;

		int small=(a<b)?a:b;
		small=(small<c)?small:c;
		int mid=(a+b+c)-(big+small);

		System.out.println(small);
		System.out.println(mid);
		System.out.println(big);

	}

}
