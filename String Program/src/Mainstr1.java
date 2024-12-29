import java.util.Scanner; 
public class Mainstr1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String str=sc.nextLine();
		
		int capital=0,small=0,digit=0,special=0;
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
				capital++;
			else if(ch>='a' && ch<='z')
				small++;
			else if(ch>='0' && ch<='9')
				digit++;
			else
				special++;
		}
		System.out.println("number of capital letters: "+capital);
		System.out.println("number of small letters: "+small);
		System.out.println("number of digits: "+digit);
		System.out.println("number of special character: "+special);

	}

}
