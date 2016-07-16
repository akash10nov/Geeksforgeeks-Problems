import java.io.*;
import java.util.*;
public class KhushZen
{
    public static void main(String[] akash)
    {
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int len=s.length();
        char[] a=new char[len];
        for(int i=0;i<len;i++)
            a[i]=s.charAt(i);
        int[] fre=new int[26];
        for(int i=0;i<len;i++)
            fre[a[i]-'a']++;
        int ans=calculate(fre,s,0);
        System.out.println(ans);
        
    }
   public static int calculate(int[] fre,String s,int k)
   {
       if(k==(s.length()-1))
        return 1;
       int a=s.charAt(k)-'a';
       int count=0;
       for(int i=0;i<a;i++)
       {
           if(fre[i]>0)
                count++;
       }
       int totalcount=0;
       fre[a]--;
       for(int i=0;i<26;i++)
       {
            totalcount+=fre[i];
        }
       
        k++;
        int ans=0;
        ans=count*(fact(totalcount));
        for(int i=0;i<26;i++)
        {
            if(fre[i]>1)
                ans=ans/fact(fre[i]);
        }
        return ans+calculate(fre,s,k);
   }
   public static int fact(int a)
   {
       int ans=1;
       for(int i=a;i>=1;i--)
        ans=ans*i;
        
       return ans;
    }
}