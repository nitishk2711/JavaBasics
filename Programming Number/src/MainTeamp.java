import java.util.Scanner;
public class MainTeamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temp. in celcius: ");
		double a=sc.nextDouble();
		
//		0 degree=32f
		
		double far=(a*9/5)+32;
		
		System.out.println("convert the temp in fahrenheit: "+far);
		

	}

}
