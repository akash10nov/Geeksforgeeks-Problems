import java.io.*;
import java.util.*;
public class Maximum_Weight
{
    public static void main(String[] akash) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        String s=br.readLine();
        int len=s.length();
        int[] DP=new int[len];
        for(int i=0;i<len;i++)
        {
            DP[i]=-1;
        }
        int ans=GoGoGo(s,0,len,DP);
        System.out.println("Fuck yeah:" + ans);
    }
    public static int GoGoGo(String s,int i,int len,int[] DP)
    {
        if(i>=len)
            return 0;
        if(DP[i]!=-1)
            return DP[i];
        int ans=1+GoGoGo(s,i+1,len,DP);
        if((i+1)<len)
        {
            if(s.charAt(i)==s.charAt(i+1))
                ans=Math.max(4+GoGoGo(s,i+2,len,DP),ans);
            else
                ans=Math.max(4+GoGoGo(s,i+2,len,DP),ans);
        }
        return DP[i]=ans;
    }
}