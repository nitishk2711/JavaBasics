import java.util.Scanner;
public class EvenOddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int even=0;
		int odd=0;
		
		while(n!=0)
		{
			int d=n%10;
			n=n/10;
			if(d%2==0)
			{
				even++;
			}
			else
			{
				odd++;
				
			}
		}
		System.out.println("total even number present in: "+even);
		System.out.println("total odd number in presesnt in: "+odd);

	}

}
