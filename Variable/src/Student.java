
public class Student {
	int boys(int p, int c, int m) {
		return p+c+m;
	}
	void girls(int total) {
		double perc = total/300.0*100.0;
		System.out.println(perc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		int x = s1.boys(75, 80, 75);
		s1.girls(x);

	}

}
