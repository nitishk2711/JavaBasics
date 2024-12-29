package arrayprogram;

public class MergeTwoArray {

	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println("Read first array: ");
		int[] x=ao.readArray();
		System.out.println("read second array: ");
		int[] y=ao.readArray();
		
		System.out.println("User entered first array :");
		ao.dispArray(x);
		
		System.out.println("User entered second array: ");
		ao.dispArray(y);
		
		int[] z= ao.merge(x,y);
		System.out.println("after merge Array: ");
		ao.dispArray(z);
	
	}

}
