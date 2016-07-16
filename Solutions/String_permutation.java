import java.io.*;
import java.util.*;
public class String_permutation
{
    public static void main(String[] akash) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the input");
        String in=br.readLine();
        int ans=Permutation(in,"",in.length(),1);
    }
    public static int Permutation(String in, String pre,int n, int r)
    {
        n=in.length();
        if(n==0)
        {
            System.out.println(r+" "+pre);
            return r+1;
            
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                
                r=Permutation(in.substring(0,i)+in.substring(i+1,n),pre+in.charAt(i),n,r);
            }
            return r;
        }
    }
}