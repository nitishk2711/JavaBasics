import java.util.Scanner;
public class LastElementSmall {
	
	static String lastSmall(String str)
	{
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ')
			{
				if(ch[i]>='A' && ch[i]<='Z')
					ch[i]=(char)(ch[i]+32);
			}
			else if(ch[i]>='a' && ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String :");
		String str=sc.nextLine();
		
		String s1=lastSmall(str);
		System.out.println(s1);
	}

}
