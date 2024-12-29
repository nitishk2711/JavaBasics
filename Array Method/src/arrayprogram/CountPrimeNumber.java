package arrayprogram;

public class CountPrimeNumber {
	
	public int countPrime(int[] ar)
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			boolean rs=isPrime(ar[i]);
			if(rs)
				count++;
		}
		return count;
		}

	static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++)
		{
			if(i%2==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println("read first array: ");
		int[] x=ao.readArray();
		
		System.out.println("user entered array: ");
		ao.dispArray(x);
		
		CountPrimeNumber pn=new CountPrimeNumber();
		
		int y=pn.countPrime(x);		
		System.out.println(pn.isPrime(y));
	}

}
