import java.io.*;
import java.util.*;
public class LexStringPermutation
{
    static int count=0;
    public static void main(String[] akash)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("insert the string");
        String s=sc.next();
        int len=s.length();
        char[] temp=new char[len];
        for(int i=0;i<len;i++)
            temp[i]=s.charAt(i);
        Arrays.sort(temp);
        String s_final="";
        for(int i=0;i<len;i++)
            s_final=s_final+temp[i];
        String pre="";
        new LexStringPermutation().LexiographicalOrder(s_final,pre,s.length());
        
    }
    public void LexiographicalOrder(String s, String pre, int n)
    {
        n=s.length();
        if(n==0)
            System.out.println(count+++" "+pre);
        for(int i=0;i<n;i++)
        {
            LexiographicalOrder(s.substring(0,i)+s.substring(i+1,n),pre+s.charAt(i),n);
        }
    }
}