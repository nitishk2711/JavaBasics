
public class Triangle {
	void Area(double b, int h) {
		double x = 0.5*b*h;
		System.out.println("area of triangle"+"="+x);
	}
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.Area(4, 6);
	}

}
