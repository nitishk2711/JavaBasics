import java.util.Scanner;
public class MainRactangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height of reactangle: ");
		int h=sc.nextInt();
		System.out.println("enter the base of the reactangle: ");
		int b=sc.nextInt();
		
		int area=h*b;
		int para=2*(h+b);
		
		System.out.println("area of the reactangle: "+area);
		System.out.println("parameter is the reactangle: "+para);

	}

}
