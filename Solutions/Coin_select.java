import java.io.*;
import java.util.*;
public class Coin_select
{
    public  static void main(String[] akash) throws IOException
    {
		System.out.println("enter the coins and then value");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String[] s_in=s.split(" ");
        int len=s_in.length;
        int[] a=new int[len];
        String value=br.readLine();
		int val=Integer.parseInt(value);
        for(int i=0;i<len;i++)
            a[i]=Integer.parseInt(s_in[i]);
		Arrays.sort(a);
        String s_ans="";
		String ans=Method(a,val,s_ans);
		System.out.println(ans);
    }
	public static String Method(int[]a,int val,String s)
	{
		for(int i=0;i<a.length;i++)
		{
			if(val-a[i]==0)
			{
				String retString=s+" "+Integer.toString(a[i]);
				return retString;
			 }
			else if(val-a[i]>0)
			{
				return Method(a,val-a[i],s+" "+Integer.toString(a[i]));
			 }
			else
			{
				break;
			 }
		  }
			return "fuck you";
	   }
}