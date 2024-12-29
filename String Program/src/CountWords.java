import java.util.Scanner;
public class CountWords {
	
	static int countWord(String str)
	{
		int count=0;
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
				count++;
		}
		return count;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String str=sc.nextLine();
		
		int Wc=countWord(str);
		System.out.println("num of the words: "+Wc);

	}

}
