import java.util.Scanner;
public class SumOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		
		int i=1;
		int EvenSum=0;
		int OddSum=0;
		
		while(i<=n)
		{
			if(i%2==0)
				EvenSum=EvenSum+i;
			else
				OddSum=OddSum+i;
				i++;
		}
		System.out.println("sum of even number is: "+EvenSum);
		System.out.println("sum of odd  number is: "+OddSum);
		
		
	}

}
