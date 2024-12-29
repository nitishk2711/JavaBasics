
public class Bike {
	String name, color;
	int price, tax;
	Bike(String n, String c,  int p, int t){
		this.name = n;
		this.color = c;
		this.price = p;
		this.tax = t;
	}
	void detail()
	{
		System.out.println("bike name ="+" "+ this.name);
		System.out.println("color="+" "+this.color);
		System.out.println("price="+" "+this.price);
		System.out.println("tax="+" "+this.tax);
		
	}
	void totalPrice()
	{
		System.out.println("totalprice="+" "+(this.price+this.tax));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike("KAWASKI","GREEN", 594000, 25000);
		Bike b2 = new Bike("STREET TRIPLE R", "RED", 884000, 35000);
		Bike b3 = new Bike("DUGATI PANIGALE V2", "BLACK", 1700000,50000);
		System.out.println("====================");
		b1.detail();
		b1.totalPrice();
		System.out.println("====================");
		b2.detail();
		b2.totalPrice();
		System.out.println("====================");
		b3.detail();
		b3.totalPrice();
		System.out.println("====================");

	}

}
