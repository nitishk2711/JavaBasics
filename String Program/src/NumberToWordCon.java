import java.util.Scanner;
public class NumberToWordCon {
	
	static void nw(int n, String st)
	{
		String x[]= {"","one","two","three","four","five","six","seven",
				"eight","nine","ten","eleven","twelve","thirteen",
				"fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		
		String y[]= {"","","twenty","thirty","fourty","fifty","sixty","sevnty","eighty","ninty"};
		
		if(n<20)
			System.out.print(x[n]);
		else
			System.out.print(y[n/10]+x[n%10]);
		
		if(n!=0)
			System.out.print(st+" ");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount: ");
		int amt=sc.nextInt();
		
		nw(amt/10000000,"crore");
		nw(amt/100000%100,"lakh");
		nw(amt/1000%100,"thousand");
		nw(amt/100%10,"hundred");
		nw(amt%100,"");
		

	}

}
