import java.util.Scanner;
public class MainStr3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String str=sc.nextLine();
		
		char[] ch=str.toCharArray();
		int dc=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>'0' && ch[i]<'9')
				dc++;
		}
		System.out.println("number of digits present in the string: "+dc);

	}

}
