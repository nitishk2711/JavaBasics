

public class ChangeeElementToSumOfDigit {
	
	static void update(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			int sum=0;
			do {
				int d=x[i]%10;
				sum=sum+d;
				x[i]=x[i]/10;
			}while(x[i]!=0);
			x[i]=sum;
		}
	}

	public static void main(String[] args) {
		
		int ar[]= {45,67,89,76,32,28};
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		update(ar);
		System.out.print("\n after update: ");
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
