import java.io.*;
class BitStrings
{
	public static void main (String args[]) throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader (System.in));
		int a=Integer.parseInt(b.readLine());
		long c=1000000007L, d=1L;
		while (a>0)
		{
			d*=2L;
			d%=c;
			a--;
		}
		System.out.println(d);
	}
}
