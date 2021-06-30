import java.util.*;
class MinMoves
{
	public static void main(String args[])
	{
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		long[] arr=new long[a];
		for(int i=0; i<a; i++)
		arr[i]=s.nextLong();
		int min=0;long count=0;
		for (int i=0; i<a-1; i++)
		{
			if(arr[i+1]>=arr[i])
			continue;
			else
			{count+=arr[i]-arr[i+1];
			arr[i+1]=arr[i];
			}
		}
		System.out.println(count);
	}
}
