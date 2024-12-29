

public class ReverseElement {
	
	static void reverse(int x[])
	{
		int i=0;
		int j=x.length-1;
		
		while(i<j)
		{
			int temp=x[i];
			x[i]=x[j];
			x[j]=temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		int ar[]= {45,67,89,76,32,28};
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		reverse(ar);
		System.out.print("\n aftre reverse: ");
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}

	}

}
