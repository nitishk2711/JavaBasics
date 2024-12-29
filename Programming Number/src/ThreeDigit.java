import java.util.Scanner;
public class ThreeDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 3 digit value: ");
		int a=sc.nextInt();
		
		if(a>=100 && a<=999 || a<=-100 && a>=-999)
			System.out.println("this is three digit number");
		else
			System.out.println(" this is not three digit number");

	}

}
