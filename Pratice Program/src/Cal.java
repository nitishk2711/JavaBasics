
public class Cal {
	void cube(int n) {
		int x = n*n*n;
		System.out.println(n+"*"+n+"*"+n+"="+x);
	}
	public static void main(String[] args) {
		Cal c1 = new Cal();
		c1.cube(6);
	}

}
