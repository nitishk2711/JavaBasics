import java.util.Scanner;
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String st=sc.next();
		
		for(int i=1;i<=st.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(st.charAt(j)+" ");
			}
			System.out.println();
		}

	}

}
