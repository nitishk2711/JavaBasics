import java.util.Scanner;
public class PrimeNumber {
	
	static boolean isPrime(int x) {
		for(int i=2;i<=x/2;i++) {
			if(x%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a number: ");
		int n=sc.nextInt();
		
		boolean rs=isPrime(n);
				
				if(rs==true)
					System.out.println(n+" is a prime number");
				else
					System.out.println(n+" is a not prime number");

	}

}
