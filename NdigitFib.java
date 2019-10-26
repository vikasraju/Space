import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class NdigitFib 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		BigInteger f2 = new BigInteger("0");
		BigInteger f = new BigInteger("1");
		int a[] = new int[5000];
		a[0] = 1;
		int l=1;
		int c= 1;	
		int t = in.nextInt();
		for(int i=0; i< t; i++)
		{
			int n = in.nextInt();	
			
			if(a[n-1] !=0)
			{
				System.out.println(a[n-1]);
			}
			else
			{
				while(l  < n)
				{
					BigInteger k = new BigInteger("0");
					k = f;
					f= f.add(f2);
					f2 = k;
					c++;
					String s = String.valueOf(f);
					
					if(s.length()> l)
					{
						a[l] = c;
						l++;						
					}				
				}
				System.out.println(a[n-1]);
			}					
		}
	}
}
