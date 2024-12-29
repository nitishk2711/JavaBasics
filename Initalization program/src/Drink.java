
public class Drink {
	String brand, color,quantity;
	int price;
	Drink(String b, String c, int p, String q){
		this.brand = b;
		this.color = c;
		this.price = p;
		this.quantity = q;
		
	}
	public static void main(String[] args) {
		Drink d1 = new Drink("Royal Green","Brown",1100,"750ml");
		Drink d2 = new Drink("kingfisher","Brown",250,"750ml");
		Drink d3 = new Drink("Magic-momment","white",770,"750ml");
		System.out.println(d1.brand+" "+d1.color+" "+d1.price+" "+d1.quantity);
		System.out.println(d2.brand+" "+d2.color+" "+d2.price+" "+d2.quantity);
		System.out.println(d3.brand+" "+d3.color+" "+d3.price+" "+d3.quantity);
	}
}

