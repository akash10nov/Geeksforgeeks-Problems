import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class VM_palindrome{

    public static void main(String[] args) throws IOException
    {
        System.out.println("testcase and input");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String test=br.readLine();
        int T=Integer.parseInt(test);
        for(int i=0;i<T;i++)
        {
            String s=br.readLine();
            int len=s.length();
            int flag=0;
            for(int j=0;j<=s.length()/2;j++)
            {
                  if(s.charAt(j)!=s.charAt(s.length()-j-1))
                  {
                        String s1=s.substring(j,s.length()-j-1);
                        String s2=s.substring(j+1,s.length()-j);
                        int f1=PalindromeCheck(s1);
                        int f2=PalindromeCheck(s2);
                        flag=1;
                        if(f1==0)
                            System.out.println(s.length()-j-1);
                        else
                            System.out.println(j);
                      
                  }
               
            }
            if(flag==0)
            {
                System.out.println("-1");
            }
        }
    }
     public static int PalindromeCheck(String s)
    {
        int l=s.length()-1;
        for(int i=0;i<=l/2;i++)
        {
            if(s.charAt(i)!=s.charAt(l-i))
            {
                return -1;
            }
        }
        return 0;
    }
}
