
public class Shoe {
	String name;
	String color;
	int price;
	public Shoe(String n, String c, int p) {
		this.name = n;
		this.color = c;
		this.price = p;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+color+" "+price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shoe s1 = new Shoe("PUMA","WHITE",2999);
		Shoe s2 = new Shoe("NIKE","BLACK",2984);
		Shoe s3 = new Shoe("ADDIDAS","ORANGE",3000);
		
		Shoe x[] = {s1,s2,s3};
		
		for(int i=0; i<=x.length; i++) {
			System.out.println(x[i]);
			
		}

	}

}
