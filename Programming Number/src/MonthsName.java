import java.util.Scanner;
public class MonthsName {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the months number: ");
		int m=sc.nextInt();
		
//		String st[]= {"January","February","MArch","April","May","June","July","August","September","October","November","December"};
//		
//		if(m>=1 && m<=12)
//			System.out.println("this months name is: "+st[m-1]);
//		else
//			System.out.println("enter months number is invalid");

		
		
		if(m==1)
			System.out.println("january");
		else if(m==2)
			System.out.println("February");
		else if(m==3)
			System.out.println("March");
		else if(m==4)
			System.out.println("April");
		else if(m==5)
			System.out.println("May");
		else if(m==6)
			System.out.println("June");
		else if(m==7)
			System.out.println("July");
		else if(m==8)
			System.out.println("August");
		else if(m==9)
			System.out.println("September");
		else if(m==10)
			System.out.println("October");
		else if(m==11)
			System.out.println("November");
		else if(m==12)
			System.out.println("December");
		else
			System.out.println("invalid");
	}

}
