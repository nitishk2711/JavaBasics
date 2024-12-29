
public class Student {
String name;
int phy , che , math;
Student(String n, int p, int c, int m){
	this.name = n;
	this.phy = p;
	this.che = c;
	this.math = m;
	
}
void totalMarks()
{
	System.out.println("TotalMarkst" +" "+this.phy+this.che+this.math);
}
void percentage()
{
	System.out.println("percentage"+" "+(this.phy+this.che+this.math)/300.0*100.0);
}
void detail()
{
	System.out.println(this.name);
	System.out.println(this.phy);
	System.out.println(this.che);
	System.out.println(this.math);
}
public static void main(String[] args) {
	Student s1=new Student("Raja",88,90,85);
	Student s2=new Student("Tarun",85,70,92);
	System.out.println("====================");
	s1.detail();
	s1.totalMarks();
	s1.percentage();
	System.out.println("====================");
	s2.detail();
	s2.totalMarks();
	s2.percentage();
	System.out.println("====================");
	
}
}