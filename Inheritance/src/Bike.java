
public class Bike extends Vehicle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike();
		b1.name = "RE";
		b1.price= 27500;
		System.out.println(b1.name);
		System.out.println(b1.price);
		b1.startEngin();
		b1.stopEngin();

	}

}
