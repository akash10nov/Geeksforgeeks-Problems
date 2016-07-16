import java.util.*;
import java.io.*;
public class Goodreads_Practice
{
    public static void main(String[] akash) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int n=sc.nextInt();
        ifElse(n,n,"");
    }
    public static void ifElse(int n,int m,String s)
    {
        if(n==0 && m==0)
        {
            System.out.println(s);
        }
        else
        {
            if(n>=0)
            {
                ifElse(n-1,m,s+"  "+ "if");
                if(m>n)
                {
                    ifElse(n,m-1,s+"  "+ "endif");
                }
                
            }
        }
    }
}