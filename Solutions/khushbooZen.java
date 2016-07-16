import java.io.*;
import java.util.*;
public class Khushboozen
{
    public static void main(String[] akash) throws IOException
    {
        System.out.println("input");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String[] terms=s.split(" ");
        int ans=equation(terms,0,terms.length-1);
        System.out.println(ans);
    }
    public static int equation(String[] terms,int s,int e)
    {
        int ans=0;
        for(int i=s+1;i<e;i++)
        {
            if(terms[i].equals("("))
            {
                i=i+1;
                int start=i-1;
                int net_count=1;
                while(net_count!=0)
                {
                    if(terms[i].equals(")"))
                    {
                        net_count--;
                    }
                    i=i+1;
                }
                int end=i-1;
                ans+=equation(terms,start,end);
            }
            else if(terms[i].equals("+") || terms[i].equals(")"))
            {
            }
            else
            {
                ans+=Integer.parseInt(terms[i]);
            }
        }
        return ans;
    }
}