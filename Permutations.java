import java.util.*;
class Permutations
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a>1 && a<4)
		System.out.println("NO SOLUTION");
		else{
		int[] y=new int[a];int x=0,z=0;
		for(int i=0; i<a; i++)
		{
			if(i%2==0)
			{
			y[a/2+x]=i+1;
			x++;
			}
			else
			{
			y[z]=i+1;
			z++;
			}
		}
		int i=2;
		for(i=2; i<a-2; i+=5)
		System.out.print(y[i-2]+" "+y[i-1]+" "+y[i]+" "+y[i+1]+" "+y[i+2]+" ");
		if(i!=a-3)
		{
		i=i-2;
		for(int k=i; k<a; k++)
		System.out.print(y[k]+" ");
		}
		}
	}
}
