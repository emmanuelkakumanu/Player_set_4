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
		int k=s.nextInt();int f=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				f=1;break;
			}
		}
		if(f==1)
		System.out.print("Yes");
		else
		System.out.print("No");

	}
}
