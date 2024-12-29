
public class Pizza {
String type,toopings;
int price;
Pizza(String t, String tp, int p){
	this.type = t;
	this.toopings = tp;
	this.price = p;
}
void detail()
{
	System.out.println(this.type);
	System.out.println(this.toopings);
	System.out.println(this.price);
}
void totalPrice()
{
	System.out.println(this.price+this.price*0.18);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p1 = new Pizza("Regular", "Golden-Corn",150);
		Pizza p2 = new Pizza("Medium", "Panner", 250);
		Pizza p3 = new Pizza("Large", "Veggie" , 350);
		p1.detail();
		p1.totalPrice();
		System.out.println("=========================");
		p2.detail();
		p2.totalPrice();
		System.out.println("=========================");
		p3.detail();
		p3.totalPrice();
	}

}
