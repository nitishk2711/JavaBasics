import java.util.Scanner;
public class PrimeDigit {
	static void isPrime(int x) {
		int p=0;
		do {
			
			int d=x%10;
			x=x/10;
			if(x%2!=0)
				
				p++;
				
				
		}while(x!=0);
		System.out.println(p+" Prime digits present");
//		System.out.println(np+" not prime digit present");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		
		isPrime(n);

	}

}
