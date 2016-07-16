import java.io.*;
import java.util.*;
public class EqualPartition
{
    static int min=0;
    public static void main(String[] akash)
    {
        System.out.println("Enter the size and then the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int total_sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            total_sum+=a[i];
        }
        min=total_sum;
        int min_difference=equal_partition(a,n-1,total_sum,0);
        System.out.println(min_difference);
    }
    public static int equal_partition(int[] a, int i,int total_sum,int sum)
    {
        if(i==0)
        {
            int diff1=Math.abs(total_sum-sum-a[i]-(sum+a[i]));
            if(diff1<min)
                min=diff1;
            int diff2=Math.abs((total_sum-sum)-(sum));
            if(diff2<min)
                min=diff2;
            return min;
        }
        return min(equal_partition(a,i-1,total_sum,sum+a[i]),equal_partition(a,i-1,total_sum,sum));
    }
    public static int min(int a,int b)
    {
        if(a>b)
            return b;
        return a;
    }
}