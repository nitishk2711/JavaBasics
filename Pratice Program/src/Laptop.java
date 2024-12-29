
public class Laptop {
String brand;
String name;
String processor;
int price;
public static void main(String[] args) {
	Laptop l1 = new Laptop();
	l1.brand = "dell";
	l1.name = "inspiron";
	l1.processor = "i3";
	l1.price = 78665;
	System.out.println(l1.brand);
	System.out.println(l1.name);
	System.out.println(l1.processor);
	System.out.println(l1.price);
	
	Laptop l2 = new Laptop();
	l2.brand = "hp";
	l2.name = "pavilion";
	l2.processor = "i7";
	l2.price = 78665;
	System.out.println(l2.brand);
	System.out.println(l2.name);
	System.out.println(l2.processor);
	System.out.println(l2.price);
	
	Laptop l3 = new Laptop();
	l3.brand = "apple";
	l3.name = "mac-book";
	l3.processor = "i7";
	l3.price = 78665;
	System.out.println(l3.brand);
	System.out.println(l3.name);
	System.out.println(l3.processor);
	System.out.println(l3.price);
	
	
}
}
