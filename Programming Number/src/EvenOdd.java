import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one integer value: ");
		int n=sc.nextInt();
		
//		if(n/2==n)
//		{
//			System.out.println(n+"is even number");
//		}
//		else
//		{
//			System.out.println(n+"is odd number");
		
		
		
//		}
		
//		this is the  logic based on index size; 
		
//		String st[]= {"even","odd"};
//		System.out.println(n+" is a "+st[n%2]);
//		

		
		
	switch(n%2)
	{
		case 0: System.out.println(n+" is even number");
		break;
		
		case 1:System.out.println(n+" is odd number");
	}
	}

}
