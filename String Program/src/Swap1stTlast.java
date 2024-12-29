import java.util.Scanner;;
public class Swap1stTlast {
	
	static String swapFLChar(String str)
	{
		char[] ch=str.toCharArray();
		int f=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
			{
				f=i;
				
			}else if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ')
			{
				char t=ch[f];
				ch[f]=ch[i];
				ch[i]=t;
			}	
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String str=sc.nextLine();
		
		String rs=swapFLChar(str);
		System.out.println(rs);

	}

}
