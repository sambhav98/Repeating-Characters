import java.io.*;
public class Sam
{
	public static void main(String[] args)
			throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int i,j;
		int a[]=new int[123];
		//System.out.println((int)str.charAt(0));
		for(i=0;i<str.length();i++)
		{
			for(j=97;j<=122;j++)
			{
			
				if((int)str.charAt(i)==j)
				{
					a[j]++;
					
				}
			}
		}
					
		for(j=97;j<=122;j++)
		{
			if(a[j]>0)
			{
				char ch=(char)j;
				System.out.println(ch);
				System.out.println(a[j]);
			}
		}
	}

	
}