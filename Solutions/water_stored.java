/*
 * http://www.geeksforgeeks.org/amazon-interview-experience-220-on-campus/
 */
import java.io.*;
import java.util.*;
public class water_stored
{
    public static void main(String[] akash)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int[] left_high=new int[n];
        int[] right_high=new int[n];
        left_high[0]=0;
        left_high[1]=a[0];
        int lh=a[0];
        for(int i=2;i<n;i++)
        {
            if(a[i-1]>lh)
            {
                lh=a[i-1];
                left_high[i]=lh;
            }
            else
                left_high[i]=lh;
        }
        int rh=a[n-1];
        right_high[n-1]=0;
        right_high[n-2]=a[n-1];
        for(int i=2;i<n;i++)
        {
            if(a[n-i]>rh)
            {
                rh=a[n-i];
                right_high[n-i]=rh;
            }
            else
                right_high[n-i]=rh;
        }
        
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int temp=0;
            if(right_high[i]<left_high[i])
                temp=right_high[i];
            else
                temp=left_high[i];
            if(temp>a[i])
                ans=ans+temp-a[i];
        }
        System.out.println(ans);
    }
}