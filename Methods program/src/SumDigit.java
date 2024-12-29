import java.util.Scanner;
class SumDigit
{
	static void isSumDigit(int x){
		int sum=0;
		do{
			int r=x%10;
			sum=sum+r;
			x=x/10;
		}while(x!=0);
		System.out.println("sum of the digit is: "+sum);
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		System.out.println();
		
		isSumDigit(n);
		
	  }
}