import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Smithnum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number:");
        int[] a=new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89};
        int t=sc.nextInt();
        int len=a.length;
        int sum=0;
        int p=t;
        for(int i=0;i<len;i++)
            {
                 while(t%a[i]==0)
                     {
                     sum=sum+a[i];
                     int q=a[i];
                      while(t!=0)
                      {
                          sum=sum+(q%10);
                          q=q/10;
                       }
                     t=t/a[i];
                 }
        }
         while(t!=0)
            {
            sum=sum+(t%10);
            t=t/10;
        }
         System.out.println(sum);
        int sum1=0;
        while(p!=0)
            {
            sum1=sum1+(p%10);
            p=p/10;
        }
        System.out.println(sum1);
        if(sum1==sum)
            System.out.println("1");
        else
             System.out.println("0");
    }
}