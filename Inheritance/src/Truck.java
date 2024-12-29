
public class Truck extends Vehicle {
	public static void main(String[] args) {
		Truck t1 = new Truck();
		t1.name = "volvo";
		t1.price = 7500000;
		System.out.println(t1.name);
		System.out.println(t1.price);
		t1.startEngin();
		t1.stopEngin();
	}

}
