import java.util.Scanner;
public class MainDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one integer value: ");
		int n = sc.nextInt();
		
		if(n>=-9 && n<=9)
			System.out.println(n+" is a digit");
		else
			System.out.println(n+" is a number");

	}

}
