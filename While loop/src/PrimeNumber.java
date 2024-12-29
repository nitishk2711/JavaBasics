import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		isPrime(n);

	}
	static void isPrime(int x) {
		int count=0;
		for(int i=1;i<=x;i++) {
			if(x%i==0)
				count++;
		}
		if(count==2)
			System.out.println("prime");
		else
			System.out.println("not a prime");
	}

}
