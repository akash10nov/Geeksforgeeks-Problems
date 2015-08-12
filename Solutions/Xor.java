import java.io.*;
import java.util.*;
class Xor
{
    public static void main(String[] akash) throws IOException
    {
        System.out.println("Input");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        String[] a=input.split(" ");
        int len=a.length;
        int[] in=new int[len];
        int ans;
        for(int i=0;i<len;i++)
        {
            in[i]=Integer.parseInt(a[i]);
        }
        if(len%2!=0)
        {
            ans=in[0]^in[len-1];
        }
        else
        {
            ans=in[1];
            for(int i=2;i<(len-1);i++)
            {
                ans=ans^in[i];
            }
        }
        System.out.println(ans);
        
    }
}