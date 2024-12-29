package arrayprogram;

public class NegAndPosNumber {
	
	static int[] checkNumber(int[] ar)
	{
		int pos=0,neg=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
				neg++;
			else
				pos++;
		}
		int[] count= {neg,pos};
		return count;
	}

	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println("read array : ");
		int[] x=ao.readArray();
		System.out.println("user entered array: ");
		ao.dispArray(x);
		
		NegAndPosNumber pn=new NegAndPosNumber();
		int[] c=pn.checkNumber(x);
		
		System.out.println("negative number present in thr array: "+c[0]);
		System.out.println("positive number present in thr array: "+c[1]);
		
		
		
		

	}

}
