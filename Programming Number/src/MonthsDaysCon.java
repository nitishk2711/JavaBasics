import java.util.Scanner;
public class MonthsDaysCon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter months number: ");
		
		int m=sc.nextInt();
		int days=(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==10 || m==12)?31:(m==4 || m==6 || m==9 || m==11)?30:(m==2)?28:0;
		System.out.println(days+" days");
		

	}

}
