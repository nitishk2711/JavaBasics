import java.util.Scanner;
public class MainResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter four subject marks: ");
		int p=sc.nextInt();
		int c=sc.nextInt();
		int m=sc.nextInt();
		int b=sc.nextInt();
		
//		if(p>=35 && c>=35 && m>=35 && b>=35)
//			System.out.println("Pass");
//		else
//			System.out.println("Fail");
		
		
		if(p<35 || c<35 || m<35 || b<35)
			System.out.println("Fail");
		else
			System.out.println("Pass");

	}

}
