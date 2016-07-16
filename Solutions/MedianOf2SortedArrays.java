import java.io.*;
import java.util.*;
public class MedianOf2SortedArrays
{
    public static void main(String[] akash)
    {
        System.out.println("enter the size and then the arrays");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();
        int ans=FindtheMedian(a,b,0,n-1,0,n-1);
        System.out.println(ans);
    }
    public static int FindtheMedian(int[] a,int[] b,int a_s,int a_e,int b_s,int b_e)
    {
        if(a[a_e]<b[b_s])
            return a[a_e];
        else if(a[a_s]>b[b_e])
            return b[b_e];
        int a_mid=(a_e+a_s)/2;
        int b_mid=(b_e+b_s)/2;
        if(a[a_mid]==b[b_mid])
            return a[a_mid];
        else if(a[a_mid]>b[b_mid] && a[a_mid]<=b[b_mid+1])
            return (a[a_mid]+b[b_mid])/2;
        else if(a[a_mid]<b[b_mid] && a[a_mid+1]>=b[b_mid])
            return (a[a_mid]+b[b_mid])/2;
        else if(a[a_mid]<b[b_mid])
            return FindtheMedian(a,b,a_mid,a_e,b_s,b_mid);
        else 
            return FindtheMedian(a,b,a_s,a_mid,b_mid,b_e);

    }
}