
public class SuperBike {
	String model;
	String engin;
	String topspeed;
	int price;
	SuperBike(String m, String e, String t, int p){
		this.model = m;
		this.engin = e;
		this.topspeed = t;
		this.price = p;
		
	}
	public static void main(String[] args) {
		SuperBike s1 = new SuperBike("KAWASAKI Z650", "649 CC", "210 KMPH", 594000);
		SuperBike s2 = new SuperBike("STREET TRIPLE R", "765 CC", "225 KMPH", 884000);
		SuperBike s3 = new SuperBike("DUGATI PANIGALE V2", "955 CC", "257 KMPH", 17000000);
		System.out.println(s1.model+" "+s1.engin+" "+s1.topspeed+" "+s1.price);
		System.out.println(s2.model+" "+s2.engin+" "+s2.topspeed+" "+s2.price);
		System.out.println(s3.model+" "+s3.engin+" "+s3.topspeed+" "+s3.price);
		}

}
