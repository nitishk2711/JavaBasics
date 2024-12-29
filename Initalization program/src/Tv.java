
public class Tv {

	String name;
	String type;
	int price;
	Tv(String n , String t , int p){
		this.name = n;
		this.type = t;
		this.price = p;
	}
	public static void main(String[] args) {
		Tv t1 = new Tv("SONY","LCD",45000);
		Tv t2 = new Tv("MI","LED",28765);
		Tv t3 = new Tv("ONEPLUS","LED",25664);
		System.out.println(t1.name+" " +t1.type+" "+t1.price);
		System.out.println(t2.name+" "+t2.type+" "+t2.price);
		System.out.println(t3.name+" "+t3.type+" "+t3.price);
	}

}
