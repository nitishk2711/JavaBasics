import java.util.Scanner;
public class Factroial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		
		/*int i=1,fact=1;
		
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("factorial of "+n+" is: "+fact); */
		
		int fact=1;
		while(n>1)
		{
			fact=fact*n;
			n--;
		}
		System.out.println("factorial of enter number is: "+fact);
	}

}
