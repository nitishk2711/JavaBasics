
public class Demo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {10,11,12,13,14,15,16,17,18,19,20};
		int lastindex = n.length-1;
		
		System.out.println("FARWARD DIRECTION");
		
		for(int i=0; i<=lastindex; i++)
		{
			System.out.print(n[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("REVERSE DIRECTION");
		
		for(int i=lastindex; i>=0; i--) {
			System.out.print(n[i]+" ");
		}
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("print execpt first and last");
		for(int i=1; i<=lastindex-1; i++) {
			System.out.print(n[i]+" ");
		}
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("last 4 data");
		
		for(int i=lastindex-3; i<=lastindex; i++)
		{
			System.out.print(n[i]+" ");
		}
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("exepct first two and last two data");
		
		for(int i=2; i<=lastindex-2; i++) {
			System.out.print(n[i]+" ");
		}
	}

}
