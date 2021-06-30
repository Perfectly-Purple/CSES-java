import java.io.*;
class NumSpiral
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		//method 1:
		long m=0; 
		long[] elements=new long[a];
		long row=0, column=0, element=0;
		for(int i=0; i<a; i++)
		{
			String[] str=br.readLine().split(" ");
			row=Long.parseLong(str[0]);
			column=Long.parseLong(str[1]);
			if(row>=column)
			m=row;
			else
			m=column;
			element=m*m-m+1+(row-column)*(long)Math.pow(-1,m);
			elements[i]=(long)element;
		}
		int i;
		for(i=17; i<a; i+=35)
		{
		try{
		System.out.println(elements[i-17]+"\n"+elements[i-16]+"\n"+elements[i-15]+"\n"+elements[i-14]+"\n"+elements[i-13]+"\n"+elements[i-12]+"\n"+elements[i-11]+"\n"+elements[i-10]+"\n"+elements[i-9]+"\n"+elements[i-8]+"\n"+elements[i-7]+"\n"+elements[i-6]+"\n"+elements[i-5]+"\n"+elements[i-4]+"\n"+elements[i-3]+"\n"+elements[i-2]+"\n"+elements[i-1]+"\n"+elements[i]+"\n"+elements[i+1]+"\n"+elements[i+2]+"\n"+elements[i+3]+"\n"+elements[i+4]+"\n"+elements[i+5]+"\n"+elements[i+6]+"\n"+elements[i+7]+"\n"+elements[i+8]+"\n"+elements[i+9]+"\n"+elements[i+10]+"\n"+elements[i+11]+"\n"+elements[i+12]+"\n"+elements[i+13]+"\n"+elements[i+14]+"\n"+elements[i+15]+"\n"+elements[i+16]+"\n"+elements[i+17]);
		}catch(Exception ArrayIndexOutOfBoundsException)
		{
		break;
		}
		}
		if(i!=a-17)
		{ i-=17;
			for(int k=i; k<a; k++)
			System.out.println(elements[k]);
		}
	}
}

		
