import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class P1_test 
{
	public static ArrayList<Integer> breaktimes()
	{
		Random rand = new Random();
		ArrayList<Integer> a = new ArrayList<>();
		int a1 = rand.nextInt((390 - 0) + 1) + 0;
		if(a1%5 != 0)
		{
			a1 = a1+ (5- a1%5);
		}
		a.add(a1);
		int b1 = rand.nextInt((390 - 0) + 1) + 0;
		b1 = b1+(5- b1%5) +5 ;
		while(a.contains(b1) == true)
		{
			b1 = rand.nextInt((390 - 0) + 1) + 0;
			b1 = b1+(5- b1%5)+ 5;
		}
		a.add(b1);
		int c1 = rand.nextInt((390 - 0) + 1) + 0;
		c1 = c1+(5- c1%5)+ 5;
		while(a.contains(c1) == true)
		{
			c1 = rand.nextInt((390 - 0) + 1) + 0;
			c1 = c1+(5- c1%5)+ 5;
		}
		a.add(c1);
		a.add(a1+5);
		a.add(b1+5);
		a.add(c1+5);
		
		return a;
	}
	
	public static int num_people() 
	{
		Random rand = new Random();
		int a = rand.nextInt((20 - 3) + 1) + 3;
		return a;
	}
	
	public static void main (String[] args ) 
	{
		int count_stat[] = new int[10];
		int num_count[] = new int[10];
		int trans[] = new int[10];
		ArrayList<ArrayList<Integer>> c = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i< 10; i++)
		{
			c.add(new ArrayList<Integer>());
		}
		
		ArrayList<Integer> people = new ArrayList<>();
		int peoplec = 0;
		int id = 1;
		for(int i =0; i<10; i++ )
		{
			count_stat[i] = 0;
			num_count[i] = 0;
			trans[i]=0;
		}
		int t=0;
		ArrayList<Integer> c0b = breaktimes();
		ArrayList<Integer> c1b = breaktimes();
		ArrayList<Integer> c2b = breaktimes();
		ArrayList<Integer> c3b = breaktimes();
		ArrayList<Integer> c4b = breaktimes();
		ArrayList<Integer> c5b = breaktimes();
		ArrayList<Integer> c6b = breaktimes();
		ArrayList<Integer> c7b = breaktimes();
		ArrayList<Integer> c8b = breaktimes();
		ArrayList<Integer> c9b = breaktimes();		
		while(t<420)
		{		
			if(c0b.contains(t)== true)
			{
				System.out.println("c0 break at " + t);
				count_stat[0] = -1; 
				num_count[0] = 0;
				peoplec = peoplec + c.get(0).size();
				while(c.get(0).isEmpty() == false)
				{
					
					people.add(c.get(0).remove(0));
				}				
			}
			else
			{
				count_stat[0] = 0;
			}
			
			if(c1b.contains(t)== true)
			{
				System.out.println("c1 break at " + t);
				count_stat[1] = -1; 
				num_count[1] = 0;
				peoplec = peoplec + c.get(1).size();
				while(c.get(1).isEmpty() == false)
				{
					people.add(c.get(1).remove(0));
				}
			}
			else
			{
				count_stat[1] = 0;
			}
			
			if(c2b.contains(t)== true)
			{
				System.out.println("c2 break at " + t);
				count_stat[2] = -1; 
				num_count[2] = 0;
				peoplec = peoplec + c.get(2).size();
				while(c.get(2).isEmpty() == false)
				{
					people.add(c.get(2).remove(0));
				}
			}
			else
			{
				count_stat[2] = 0;
			}
			
			if(c3b.contains(t)== true)
			{
				System.out.println("c3 break at " + t);
				count_stat[3] = -1; 
				num_count[3] = 0;
				peoplec = peoplec + c.get(3).size();
				while(c.get(3).isEmpty() == false)
				{
					people.add(c.get(3).remove(0));
				}
			}
			else
			{
				count_stat[3] = 0;
			}
			
			if(c4b.contains(t)== true)
			{
				System.out.println("c4 break at " + t);
				count_stat[4] = -1; 
				num_count[4] = 0;
				peoplec = peoplec + c.get(4).size();
				while(c.get(4).isEmpty() == false)
				{
					people.add(c.get(4).remove(0));
				}
			}
			else
			{
				count_stat[4] = 0;
			}
			
			if(c5b.contains(t)== true)
			{
				System.out.println("c5 break at " + t);
				count_stat[5] = -1; 
				num_count[5] = 0;
				peoplec = peoplec + c.get(5).size();
				while(c.get(5).isEmpty() == false)
				{
					people.add(c.get(5).remove(0));
				}
			}
			else
			{
				count_stat[5] = 0;
			}
			
			if(c6b.contains(t)== true)
			{
				System.out.println("c6 break at " + t);
				count_stat[6] = -1; 
				num_count[6] = 0;
				peoplec = peoplec + c.get(6).size();
				while(c.get(6).isEmpty() == false)
				{
					people.add(c.get(6).remove(0));
				}
			}
			else
			{
				count_stat[6] = 0;
			}
			
			if(c7b.contains(t)== true)
			{
				System.out.println("c7 break at " + t);
				count_stat[7] = -1; 
				num_count[7] = 0;
				peoplec = peoplec + c.get(7).size();
				while(c.get(7).isEmpty() == false)
				{
					people.add(c.get(7).remove(0));
				}
			}
			else
			{
				count_stat[7] = 0;
			}
			
			if(c8b.contains(t)== true)
			{
				System.out.println("c8 break at " + t);
				count_stat[8] = -1; 
				num_count[8] = 0;
				peoplec = peoplec + c.get(8).size();
				while(c.get(8).isEmpty() == false)
				{
					people.add(c.get(8).remove(0));
				}
			}
			else
			{
				count_stat[8] = 0;
			}
			
			if(c9b.contains(t)== true)
			{
				System.out.println("c9 break at " + t);
				count_stat[9] = -1; 
				num_count[9] = 0;
				peoplec = peoplec + c.get(9).size();
				while(c.get(9).isEmpty() == false)
				{
					people.add(c.get(9).remove(0));
				}
			}
			else
			{
				count_stat[9] = 0;
			}
			
			if(t%30 == 0)
			{
				peoplec = peoplec + num_people();
				//System.out.println("no " + peoplec);
				for(int i=0; i< peoplec; i++)
				{
					people.add(id);
					id++;		
				}
			}
			
			for(int i=0; i<10; i++)
			{
				if(count_stat[i] != -1)
				{
					if(num_count[i] < 5)
					{
						while(num_count[i]!= 5 && peoplec!=0)
						{
							num_count[i] = num_count[i] + 1;
							System.out.println("people count " + peoplec);
							System.out.println("customer id " + people.get(0)+ " to "+ "counter " + i);
							c.get(i).add(people.remove(0));
							peoplec = peoplec-1;				
						}
					}
				}
			}
			
			t = t+5;
			System.out.println("time " + t);
			
			for(int i=0; i<10; i++)
			{
				if(c.get(i).isEmpty() == false)
				{
					System.out.println("customer id "+ c.get(i).get(0)+ " completed transaction at counter "+i);
					c.get(i).remove(0);
					num_count[i] = num_count[i]-1;
					trans[i]++;
				}
			}
			
			if(t == 420)
			{
				int total_waiting = 0;
				for(int i=0; i< 10 ; i++)
				{
					System.out.println("Number of people waiting at counter "+ i + " is " + num_count[i]);
					System.out.println("Number of transactions completed at counter "+ i + " is " + trans[i]);
					total_waiting = total_waiting + num_count[i];
				}
				System.out.println("Total people waitnig are "+ total_waiting );
			}	
		}
	}
}