
public class Tv {
String name;
String type;
int price;
public static void main(String[] args) {
	Tv t1 = new Tv();
	t1.name = "sony";
	t1.type = "lcd";
	t1.price = 45000;
	System.out.println(t1.name);
	System.out.println(t1.type);
	System.out.println(t1.price);
	Tv t2 = new Tv();
	t2.name = "Mi";
	t2.type = "led";
	t2.price = 28765;
	System.out.println(t2.name);
	System.out.println(t2.type);
	System.out.println(t2.price);
	Tv t3 = new Tv();
	t3.name = "sumsung";
	t3.type = "led";
	t3.price = 25664;
	System.out.println(t3.name);
	System.out.println(t3.type);
	System.out.println(t3.price);
}
}
