package arrayprogram;

public class SumofEvenAndOddDigit {

	int[] calculateSum(int[] ar)
	{
		int sumEc=0,sumOc=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
				sumEc=sumEc+ar[i];
			else
				sumOc=sumOc+ar[i];
			
		}
		int[] sum= {sumEc,sumOc};
		return sum;
		
	}

	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println("read array: ");
		int[] x=ao.readArray();
		
		System.out.println("user entered array: ");
		ao.dispArray(x);
		
		SumofEvenAndOddDigit sm=new SumofEvenAndOddDigit();
		int[] cal=sm.calculateSum(x);
		System.out.println("even number present is: "+cal[0]);
		System.out.println("odd number peresent in the: "+cal[1]);
	
		
		
	}

}
