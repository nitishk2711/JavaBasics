import java.util.Scanner;
public class MainCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius value: ");
		int a=sc.nextInt();
		double area=3.14*a*a;
		double circ=2*3.14*a;
		
		System.out.println("area of the circle is: "+area);
		System.out.println("circumference of the circle: "+circ);

	}

}
