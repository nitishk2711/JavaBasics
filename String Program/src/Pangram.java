import java.util.Scanner;
public class Pangram {
	
	
	/*
	static boolean isPangram(String str)
	{
		if(str.length()<20)
		{
			return false;
		}
		int count[]=new int[20];
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
			else if(ch>='a' && ch<='z')
				count[ch-97]++;
		}
		for(int i=0;i<26;i++)
		{
			if(count[i]==0)
				return false;
		}
		return true;
		
	}
	
	*/
	
	
	static boolean isPangram(String str)
	{
		if(str.length()<26)
			return false;
		
		str=str.toLowerCase();
		for(char ch='a'; ch<='z'; ch++)
		{
			if(str.indexOf(ch)==-1)
				return false;
		}
		return true;
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter tye string: ");
		String str=sc.nextLine();
		
		boolean rs=isPangram(str);
		if(rs)
		System.out.println("string is pangram: ");
		else 
			System.out.println("string is not a pangram: ");

	}

}
