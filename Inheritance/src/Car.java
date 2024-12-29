
public class Car extends Vehicle {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "Honda";
		c1.price = 1500000;
		System.out.println(c1.name);
		System.out.println(c1.price);
		c1.startEngin();
		c1.stopEngin();
	}

}
