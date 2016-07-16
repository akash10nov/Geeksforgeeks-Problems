import java.io.*;
import java.util.*;
public class QuoraCode
{
    public static void main(String[] akash) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        System.out.println("n and k and then array:");
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int increase_begin=0;
        int decrease_begin=0;
        long[] k_sum=new long[n];
        k_sum[0]=0;
        k_sum[1]=0;
        for(int i=2;i<n;i++)
        {
            k_sum[i]=k_sum[i-1]+i-1;
        }
        // cont stands for continous.
        int cont_increase=1;
        int cont_decrease=1;
        int in_count=0;
        int dec_count=0;
        int flag=0;
        int start_in=0;
        int start_dec=0;
        for(int i=1;i<k;i++)
        {
            
            if(a[i]>=a[i-1])
            {
                cont_increase++;
            }
            else if(cont_increase>1)
            {
                if(flag==0)
                {
                    start_in=cont_increase;
                    flag=1;
                }
                in_count=in_count+(int)k_sum[cont_increase];
                cont_increase=1;
            }
            if(a[i]<=a[i-1])
            {
                cont_decrease++;
            }
            else if(cont_decrease>1)
            {
                 if(flag==0)
                {
                    start_dec=cont_decrease;
                    flag=1;
                }
                dec_count=dec_count+(int)k_sum[cont_decrease];
                cont_decrease=1;
            }
            if(i==(k-1))
            {
                if(flag==0)
                {
                    start_in=cont_increase;
                    start_dec=cont_decrease;
                    flag=1;
                }
                  in_count=in_count+(int)k_sum[cont_increase];
                  dec_count=dec_count+(int)k_sum[cont_decrease];
            }
        }
        System.out.println(in_count-dec_count);
    
    for(int i=k;i<n;i++)
    {
        if(start_in>0)
        {
            in_count=in_count-start_in;
            start_in--;
        }
        if(start_dec>0)
        {
            dec_count=dec_count-start_dec;
            start_dec--;
        }
        if(a[i-1]>=a[i])
        {
            cont_decrease++;
            if(cont_decrease>1 && cont_decrease!=start_dec)
            {
                dec_count=dec_count+cont_decrease;
            }
        }
        if(a[i-1]<=a[i])
        {
            cont_increase++;
            if(cont_increase>1 && cont_increase!=start_in)
            {
                in_count=in_count+cont_increase;
            }
        }
    }
}
}