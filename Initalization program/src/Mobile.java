
public class Mobile {
	String brand;
	String name;
	int price;
	String ram;
	Mobile(String b, String n, int p, String r){
		this.brand = b;
		this.name = n;
		this.price = p;
		this.ram = r;
	}
	public static void main(String[] args) {
		Mobile m1 = new Mobile("REALME", "8PRO", 1999, "8GB");
		Mobile m2 = new Mobile("REDMI", "9PRO", 19496, "8GB");
		Mobile m3 = new Mobile("APPLE", "I PHONE 12", 119900, "6GB");
		System.out.println(m1.brand+" "+m1.name+" "+m1.price+" "+m1.ram);
		System.out.println(m2.brand+" "+m2.name+" "+m2.price+" "+m2.ram);
		System.out.println(m3.brand+" "+m3.name+" "+m3.price+" "+m3.ram);
	}

}
