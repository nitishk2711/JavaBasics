import java.util.Scanner;
public class MainDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter week day number: ");
		int n=sc.nextInt();
		
		if(n>=0 && n<=7)
			System.out.println("enter number in week day is valid");
		else
			System.out.println("enter number is invalid week day number");

	}

}
