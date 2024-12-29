import java.util.Scanner;
public class TwodigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer value: ");
		int n=sc.nextInt();
		
		if(n>=10 && n<=99 || n<=-10 && n>=-99)
			System.out.println("this is digit number");
		else
			System.out.println("this is not two digit number");

	}

}
