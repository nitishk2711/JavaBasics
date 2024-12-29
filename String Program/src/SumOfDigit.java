import java.util.Scanner;
public class SumOfDigit {
	
	static int calculateSumOfDigit(String str)
		{
		char[] ch=str.toCharArray();
		int sum=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>'0' && ch[i]<'9')
			sum=sum+(ch[i]-48);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String str=sc.nextLine();
		
		int add=calculateSumOfDigit(str);
		System.out.println(add);
		
		
		
	}

}
