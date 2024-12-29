
public class Mobile {
String brand;
String name;
int Price;
String RAM;

public static void main(String[] args) {
	Mobile m1 = new Mobile();
	m1.brand = "RealMe";
	m1.name = "8pro";
	m1.Price = 19999;
	m1.RAM = "8gb";
	System.out.println(m1.brand);
	System.out.println(m1.name);
	System.out.println(m1.Price);
	System.out.println(m1.RAM);
	
	Mobile m2 = new Mobile();
	m2.brand = "RedMi";
	m2.name = "9pro";
	m2.Price = 19496;
	m2.RAM = "8gb";
	System.out.println(m2.brand);
	System.out.println(m2.name);
	System.out.println(m2.Price);
	System.out.println(m2.RAM);
	
	Mobile m3 = new Mobile();
	m3.brand = "apple";
	m3.name = "iPhone 12";
	m3.Price = 119900;
	m3.RAM = "6gb";
	System.out.println(m3.brand);
	System.out.println(m3.name);
	System.out.println(m3.Price);
	System.out.println(m3.RAM);
	
}
}
