
public class Rectangle {
	void Area(int l, int b) {
		int x = l*b;
		System.out.println("area of reactangle"+" "+x);
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.Area(12, 16);
	}

}
