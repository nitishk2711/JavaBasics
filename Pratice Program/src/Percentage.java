
public class Percentage {
	void Calculate(int phy, int che, int math) {
		int x = (phy+che+math)*100/300;
		System.out.println(phy+"+"+che+"+"+math+"="+x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Percentage p1 = new Percentage();
		Percentage p2 = new Percentage();
		p1.Calculate(80, 75, 82);
		p2.Calculate(55, 65, 76);
		

	}

}
