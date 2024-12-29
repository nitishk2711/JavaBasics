
 public class LapTop {
    String brand;
    String name;
    String processor;
    int price;
  LapTop(String b,String n,String p,int p1)
  {
	this.name = b;
	this.name = n;
	this.processor = p;
	this.price = p1;
   }
   public static void main(String[] args) 
   {
	LapTop l1 = new LapTop("DELL","INSPIRON","i3",78665);
	LapTop l2 = new LapTop("HP","PAVILION","i5",62990);
	LapTop l3 = new LapTop("APPLE","MAC BOOK","i7",110000);
	System.out.println(l1.brand+" "+l1.name+" "+l1.processor+" "+l1.price);
	System.out.println(l2.brand+" "+l2.name+" "+l2.processor+" "+l2.price);
	System.out.println(l3.brand+" "+l3.name+" "+l3.processor+" "+l3.price);
   }
  }
