import java.util.Scanner;
public class oubleBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter double value: ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		
		if(a>b && a>b && a>c && a>d)
			System.out.println(a+" a is biggest number");
		else if(b>c && b>d)
			System.out.println(b+" b is biggest number");
		else if(c>d)
			System.out.println(c+" c is biggest number");
		else
			System.out.println(d+" d is biggest number");
	}

}
