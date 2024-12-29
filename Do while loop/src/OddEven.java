import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digit: ");
		int n=sc.nextInt();
		
		int ec=0,oc=0;
		
		do {
			int r=n%10;
			if(r%2==0)
				ec++;
			else
				oc++;
			n=n/10;
		}while(n!=0);
		System.out.println("number of even digits: "+ec);
		System.out.println("number is odd digit: "+oc);
	}

}
