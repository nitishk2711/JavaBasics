import java.util.Scanner;
public class SmallNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three integer value: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a<b && a<b && a<c)
			System.out.println(a+" is smallest number");
		else if(b<c)
			System.out.println(b+" is smallest number");
		else
			System.out.println(c+" is smallest number");

	}

}
