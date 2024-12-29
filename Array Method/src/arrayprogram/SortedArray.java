package arrayprogram;

public class SortedArray {
	
	int[] merge(int[] a, int[] b)
	{
		int[] c=new int[a.length+b.length];
		int i=0,k=0,j=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
			}
			else
			{
				c[k]=b[j];
				j++;
			}
			k++;
		}
		while(i<a.length)
		{
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length)
		{
			c[k]=b[j];
			k++;
			j++;
		}
		return c;
	}

	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		
		System.out.println("read first array");
		int[] x=ao.readArray();
		
		System.out.println("read second array: ");
		int[] y=ao.readArray();
		
		System.out.println("user entered first array: ");
		ao.dispArray(x);
		
		System.out.println("user enterred second array: ");
		ao.dispArray(y);
		
		
		SortedArray sa=new SortedArray();
		
		int[] z=sa.merge(x, y);
		System.out.println("after sorted array: ");
		ao.dispArray(z);
		
		

	}

}
