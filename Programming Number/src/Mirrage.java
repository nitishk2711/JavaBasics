import java.util.Scanner;
public class Mirrage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		if(n%3==0 && n%5==0)
			System.out.println("Sanju weeds geeta");
		else if(n%5==0)
			System.out.println("Geeta");
		else if(n%3==0)
			System.out.println("Sanju");
		else
			System.out.println("Break-Up");

	}

}
