import java.util.Scanner;
public class Mainstr2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String: ");
		String str=sc.nextLine();
		
		int vc=0,cc=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
					vc++;
				else
					cc++;
			}
		}
		System.out.println("number of Vowel: "+vc);
		System.out.println("number of consonant: "+cc);

	}

}
