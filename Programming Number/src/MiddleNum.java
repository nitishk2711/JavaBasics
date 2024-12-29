import java.util.Scanner;
public class MiddleNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three distint value: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a<c || a>c && a<b)
			System.out.println(a+" is a middle value");
		else if(b>a && b<c || b<a && b>c)
			System.out.println(b+" is a middle value");
		else
			System.out.println(c+" is a middle value");

	}

}
