import java.util.Scanner;
public class Multiple5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value: ");
		int a=sc.nextInt();
		
		if(a%3==0 && a%5==0)
			System.out.println("this number is multiple of 3 & 5: "+a);
		else
			System.out.println("enter number is not multiple of 3 & 5: "+a);
	}

}
