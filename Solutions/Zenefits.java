import java.io.*;
import java.util.*;
public class zenefits
{
    public static void main(String[] akash)
    {
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        Function(s,n,n);
    }

    public static void Function(String s,int a,int b)
    {
        if(a==0 && b==0)
        {  
            System.out.println(s);
            return;
        }
        if(a>=0)
        {
            if(a>0)
                Function(s+" if ",a-1,b);
                if(b>a)
                {
                    if(b>0)
                        Function(s+" endif ",a,b-1);
                }
        }
    }
}