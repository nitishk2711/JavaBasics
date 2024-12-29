
public class Calculate {
	void add(int a, int b) {
		int x = a+b;
		System.out.println(a+" + "+b+" = "+x);
	}
	void Square(int n) {
		int x = n*n;
		System.out.println(n+" *"+n+"="+x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate c1 = new Calculate();
		Calculate c2 = new Calculate();
		c1.add(35, 70);
		c2.Square(7);

	}

}
