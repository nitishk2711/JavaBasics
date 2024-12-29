import java.util.Scanner;
class BiggestDigit
{
	static void isBiggest(int x){
	
		while(x!=0) {
		int a=x%10;
		x=x/10;
		int big=a;
		if(a<x)
			big=x;
		System.out.println(big);
		}
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		isBiggest(n);

	}
}
