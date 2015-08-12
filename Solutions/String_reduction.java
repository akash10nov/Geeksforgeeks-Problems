import java.io.*;
import java.util.*;
class String_reduction
{
    public static void main(String[] akash) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input");
        String s=br.readLine();
        int len=s.length();
        int count=1;
        String ans=null;
        int flag=0;
        for(int i=1;i<len;i++)
        {
            if(s.charAt(i-1)==s.charAt(i))
            {
                count++;
            }
            else
            {
                if(flag!=0)
                    ans=ans+s.charAt(i-count)+Integer.toString(count);
                else
                     ans=s.charAt(i-count)+Integer.toString(count);
                flag=1;
                count=1;
            }
            
        }
        if(flag!=0)
            ans=ans+s.charAt(len-1)+Integer.toString(count);
        else
            ans=s.charAt(len-1)+Integer.toString(count);
        int len1=ans.length();
        if(len1<len)
            System.out.println(ans);
        else
            System.out.println(s);
    }
}