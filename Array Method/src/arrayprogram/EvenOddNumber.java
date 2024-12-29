package arrayprogram;

public class EvenOddNumber {
	
	int[] countEO(int[] ar)
	{
		int ec=0,oc=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
				ec++;
			else
				oc++;
		}
		int[] count= {ec,oc};
		return count;
	}

	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println("read array: ");
		int[] x=ao.readArray();
		
		System.out.println("user entered array: ");
		ao.dispArray(x);
		
		EvenOddNumber nm=new EvenOddNumber();
		nm.countEO(x);
		System.out.println("even number present is: "+x[0]);
		System.out.println("odd number peresent in the: "+x[1]);
	
		
	}

}
