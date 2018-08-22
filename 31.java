import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();int op=0,cl=0,f=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='(')
			op++;
			else
			cl++;
		
			
		}
		if(op==cl)
		System.out.print("yes");
		else
		System.out.print("no");

	}
}
