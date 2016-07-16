import java.io.*;
import java.util.*;
public class Permutation_String
{
    public static void main(String[] akash) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input");
        String s=br.readLine();
        String pre="";
        Method(s,pre,s.length());
    }
    public static void Method(String s, String pre,int n)
    {
        if(pre.length()==n)
        {
            System.out.println(pre);
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                
                Method(s.substring(0,i)+s.substring(i+1),pre+s.charAt(i),n);
            }
        }
    }
}