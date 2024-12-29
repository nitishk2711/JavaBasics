import java.util.Scanner;
public class BiggestDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter double type value: ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		
		double big=(a>b && a>c && a>d)?a:(b>c && b>d)?b:(c>d)?c:d;
		
		System.out.println(big);

	}

}
