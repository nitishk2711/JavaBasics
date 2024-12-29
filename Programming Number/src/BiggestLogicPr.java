import java.util.Scanner;
public class BiggestLogicPr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		biggest number program in the logical operator
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three integer value: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c)
			System.out.println(a+" is biggest");
		else if(b>c)
			System.out.println(b+" is biggest");
		else
			System.out.println(c+" is biggest");

	}

}
