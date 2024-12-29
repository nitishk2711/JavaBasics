
public class Name {
	String firstName(String fname) {
		return "$"+fname;
		
	}
	String lastName(String lname) {
		return lname +"$";
	}
	void fullname(String fn,String ln) {
		String fullName= fn+" "+ln;
		System.out.println(fullName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n1 = new Name();
		String x = n1.firstName("Rahul");
		String y = n1.lastName("dravid");
		n1.fullname(x, y);

	}

}
