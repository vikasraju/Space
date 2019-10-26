import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HackTest {
	static boolean decToBinary(int n, int k) 
    { 
		StringBuilder s = new StringBuilder();
		StringBuilder s3 = new StringBuilder();
		boolean ans = false; 
        while (n > 0)  
        { 
        	s.append(String.valueOf(n%k));
        	s3.append(String.valueOf(n%k));
            n = n / k; 
        } 
        
        s3 = s3.reverse();
        int a1 = Integer.valueOf(s.toString());
        int a2 = Integer.valueOf(s3.toString());
        if(a1 == a2)
        {
        	ans = true;        	
        }
        return ans;
    } 
	
	public static void main(String args[]) 
	{
		Scanner in = new Scanner(System.in);
		int total = 0;
		int n= in.nextInt();
		int k= in.nextInt();
		for(int i=1; i<n; i++)
		{
			String n1 = String.valueOf(i);
			StringBuilder s1 = new StringBuilder();
			StringBuilder s2 = new StringBuilder();
			
			s1.append(n1);
			s2.append(n1);
			s2 = s2.reverse();

			if(Integer.valueOf(s1.toString()) == Integer.valueOf(s2.toString()) )
			{
				if(decToBinary(i,k) == true)
				{					
					total = total + i;
				}
			}			
		}		
		System.out.println(total);
		in.close();		
	}
}
