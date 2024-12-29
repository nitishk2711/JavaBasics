
public class SuperBike {
String model;
String engine;
String topSpeed;
int Price;
public static void main(String[] args) {
SuperBike s1 = new SuperBike();
s1.model = "kawasaki";
s1.engine = "649 cc";
s1.topSpeed = "210 kmph";
s1.Price = 594000;
System.out.println(s1.model);
System.out.println(s1.engine);
System.out.println(s1.topSpeed);
System.out.println(s1.Price);

SuperBike s2 = new SuperBike();
s2.model = "street Triple R";
s2.engine = "765 cc";
s2.topSpeed = "225 kmph";
s2.Price = 884000;
System.out.println(s2.model);
System.out.println(s2.engine);
System.out.println(s2.topSpeed);
System.out.println(s2.Price);

SuperBike s3 = new SuperBike();
s3.model = "Ducati Panigale V2";
s3.engine = "955 cc";
s3.topSpeed = "257 kmph";
s3.Price = 1700000;
System.out.println(s3.model);
System.out.println(s3.engine);
System.out.println(s3.topSpeed);
System.out.println(s3.Price);
}
}
