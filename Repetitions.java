import java.util.*;
class Repetitions
{
	public static void main(String args[])
	{
		Scanner s=new Scanner (System.in);
		String dna=s.next();
		char c=dna.charAt(0); int count=0, max=0;
		for(int i=0; i<dna.length(); i++)
		{
			if(dna.charAt(i)==c)
			count++;
			else
			{
				if(count>max)
				max=count;
				count=1;
				c=dna.charAt(i);
			}
		}
		if(count>max)
		max=count;
		System.out.println(max);
	}
}
