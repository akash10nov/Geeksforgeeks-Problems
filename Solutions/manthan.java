// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class manthan {
    public static void main(String[] akash)
    {
       manthan.manthan1(145689);
    }
    public static int manthan1(int X) {
             // write your code in Java
        String s_1=Integer.toString(X);
        String s=new StringBuilder(s_1).reverse().toString();
        int n=Integer.parseInt(s);
        int m=n;
        int temp=0;
        String reversed="";
        while(n>0)
        {
            int t2=n%10;
            if(t2>=temp)
            {
                reversed=Integer.toString(t2)+reversed;
                temp=t2;
                n=n/10;
            }
            else
            {
                break;
            }
        }
        if(n==0 && s.charAt(s.length()-1)!='0')
        {
            String add=Integer.toString(temp);
            String mid=Integer.toString(n)+add+reversed;
            String ans_s=new StringBuilder(mid).reverse().toString();
             ans_s=ans_s.substring(0,ans_s.length()-1);
            int ans=Integer.parseInt(ans_s);
            return ans;
        }
        else if(n==0 && s.charAt(s.length()-1)!='0')
        {
            String add=Integer.toString(temp);
            String mid=add+add+reversed;
            String ans_s=new StringBuilder(mid).reverse().toString();
           
            int ans=Integer.parseInt(ans_s);
            return ans;
        }
        else
        {
            String add=Integer.toString(temp);
            String mid=add+add+reversed;
            String ans_s=new StringBuilder(mid).reverse().toString();
           
            int ans=Integer.parseInt(ans_s);
            return ans;
        }
    }
}