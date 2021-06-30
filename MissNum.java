import java.util.*;
class MissNum
{
	public static void main(String args[])
	{ 
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		long m=(long)n;
		long r= ((m+1)*m/2);
		int[] num=new int[n-1];
		for(int i=0; i<n-1; i++)
		{num[i]=s.nextInt();
		r=r-num[i];
		}
		System.out.println(r);
	}
}
