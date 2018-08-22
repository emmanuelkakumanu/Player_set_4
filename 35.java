import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		str=str.trim();
		String array[]=str.split(" ");
		int cnt=0,min=0,tc=0;
		char t[]=new char[250];
		for(int i=0;i<array.length;i++)
		{
			char arr[]=array[i].toCharArray();
			for(int j=0;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[j]==arr[k])
					{
						cnt++;
						
					}
				}	
					
				if(cnt==0 )
				{
					t[tc++]=arr[j];
				}
				min=0;cnt=0;
				
			}
			
		}
		for(int i=0;i<tc;i++)
		{
			System.out.print(t[i]+" ");
		}

	}
}
