import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];int j=0;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0 && i%2==0)
			arr[j++]=i;
		}
		System.out.print(arr[0]);
		for(int k=1;k<j;k++)
		System.out.print(" "+arr[k]);
		
		

	}
}
