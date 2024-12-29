import java.util.Scanner;
public class DigitNumberCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number value");
		int n=sc.nextInt();
		
		String num=(n>=-9 && n<9)?"Digit":"Number";
		System.out.println(num);

	}

}
