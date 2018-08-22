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
		int k=s.nextInt();
		int cnt=0;
		while(n!=0)
		{
			int r=n%10;
			if(r==k)
			cnt++;
			
			n=n/10;
		}
		System.out.print(cnt);

	}
}
