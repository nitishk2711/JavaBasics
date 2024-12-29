import java.util.Scanner;
public class MainAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three integer number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		double avg=(a+b+c)/3;
		System.out.println("average of the number "+avg);

	}

}
