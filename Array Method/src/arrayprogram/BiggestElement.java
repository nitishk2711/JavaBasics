package arrayprogram;

public class BiggestElement {
	
	int getBiggest(int[] ar) 
	{
		int big=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>big)
				big=ar[i];
		}
		return big;
	}
	
	
	int getSmallest(int[] ar)
	{
		int small=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<small)
				small=ar[i];
		}
		return small;
	}
	

	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println("read the array: ");
		int[] x=ao.readArray();
		System.out.print("user entered array: ");
		ao.dispArray(x);
		
		BiggestElement big=new BiggestElement();
		System.out.println("biggest element of the array is: "+big.getBiggest(x));
		System.out.println("smallest element of the array is "+big.getSmallest(x));
		
	}

}
