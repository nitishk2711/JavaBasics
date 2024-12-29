import java.util.Scanner;
public class DayName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the week day number: ");
		int a=sc.nextInt();
		
		String[] st = {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};
		
		if(a>=0 && a<=7)
			System.out.println(a+" is a week name: "+st[a-1]);
		else
			System.out.println("this is not a valid number");

	}

}
