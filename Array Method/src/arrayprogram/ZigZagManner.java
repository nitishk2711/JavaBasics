package arrayprogram;

public class ZigZagManner {
	
	int[] ZigZag(int[] a, int[] b)
	{
		int[] c=new int[a.length+b.length];
		int i=0,k=0;
		while(i<a.length && i<b.length)
		{
			c[k]=a[i];
			k++;
			c[k]=b[i];
			i++;
			k++;
		}
		while(i<a.length)
		{
			c[k]=a[i];
			k++;
			i++;
			
		}
		
		while(i<b.length)
		{
			c[k]=b[i];
			k++;
			i++;
		}
		return c;
	}

	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println("read first array: ");
		int[] x=ao.readArray();
		System.out.println("read second array: ");
		int[] y=ao.readArray();
		
		System.out.println("user entered first array: ");
		ao.dispArray(x);
		
		System.out.println("user entered second array: ");
		ao.dispArray(y);
		
		ZigZagManner zz=new ZigZagManner();
		
		int[] z=zz.ZigZag(x, y);
		System.out.println("after zig-zag manner soterd array: ");
		ao.dispArray(z);
	}

}
