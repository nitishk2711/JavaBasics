import java.util.Scanner;
public class Anagram {
	
	
	static int[] charFreq(String s) {
		int count[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
			if(ch>='a' && ch<='z')
				count[ch-97]++;
		}
		return count;
	}
	
	
	static boolean compare(int[] arr1, int[] arr2) {
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string: ");
		String s1=sc.nextLine();
		System.out.println("entre the second string: ");
		String s2=sc.nextLine();
		
		int arr1[]=charFreq(s1);
		int arr2[]=charFreq(s2);
		
		boolean rs=compare(arr1,arr2);
				if(rs)
					System.out.println("annagrma string");
				else
					System.out.println("not an anagram string");

	}
}
