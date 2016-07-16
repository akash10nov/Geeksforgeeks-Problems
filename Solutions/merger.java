import java.io.*;
import java.util.*;
public class merger
{
    public static void main(String[] akash)
    {
        System.out.println("Enter the size and array elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] in=new int[n];
        for(int i=0;i<n;i++)
            in[i]=sc.nextInt();
        in=MergeSort(in);
        for(int i=0;i<n;i++)
            System.out.println(in[i]);
        
        
    }
    public static int[] MergeSort(int[] in)
    {
        if(in.length<=1)
            return in;
        int len=in.length;
        int[] a=new int[len/2];
        int[] b=new int[len-(len/2)];
        for(int i=0;i<len/2;i++)
            a[i]=in[i];
        for(int i=0;i<(len-(len/2));i++)
            b[i]=in[len/2+i];
        MergeSort(a);
        MergeSort(b);
        
        Merge(a,b,in);
        return in;
       
    }
    public static void Merge(int[] a,int[] b,int[] in)
    {
        int a_len=a.length;
        int b_len=b.length;
        if(b_len==0)
        {
            for(int i=0;i<a_len;i++)
                in[i]=a[i];
        }
        else if(a_len==0)
        {
            for(int i=0;i<b_len;i++)
                in[i]=b[i];
        }
        else
        {
            int j=0;
            int k=0;
            for(int i=0;i<in.length;i++)
            {
                if(k<b_len && j< a_len)
                {
                    if(a[j]>b[k])
                    {
                        in[i]=a[j];
                        j++;
                    }
                    else
                    {
                        in[i]=b[k];
                        k++;
                    }
                }
                else if(k<b_len)
                    in[i]=b[k++];
                else if(j<a_len)
                    in[i]=a[j++];
            }
        }
    }
    
}