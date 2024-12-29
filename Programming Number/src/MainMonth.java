import java.util.Scanner;
public class MainMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the months: ");
		int m=sc.nextInt();
		
		if(m>=1 && m<=12)
		System.out.println("Enter months is valid");
		else
			System.out.println("Enter months is Invalid");

	}

}
