import java.util.Scanner;
public class ResultsSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter four subject marks: ");
		int p=sc.nextInt();
		int c=sc.nextInt();
		int m=sc.nextInt();
		int b=sc.nextInt();
		
		double perc=(p+c+m+b)/400.0*100.0;
		
		if(p<35 || c<35 || m<35 || b<35)
			System.out.println("fail");
		else if(perc>80)
			System.out.println("first division with distinct");
		else if(perc>60 && perc<80)
			System.out.println("first division");
		else if(perc>50 && perc<60)
			System.out.println("second division");
		else if(perc>35 && perc<50)
			System.out.println("pass");
		
			
	}

}
