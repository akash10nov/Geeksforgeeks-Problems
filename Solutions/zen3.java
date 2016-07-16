import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class zen3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ans");
        int n=sc.nextInt();
        int[] value=new int[n];
        for(int i=0;i<n;i++)
            value[i]=sc.nextInt();
        int[] prime=new int[n+1];
        findPrime(n,prime);
        int ans=0;
        for(int i=0;i<n;i++)
            System.out.println(prime[i]);
        for(int i=0;i<n;i++)
        {
            int j=0;
            while((prime[j]+i)<n && prime[j]!=0)
            {
                ans=ans+(value[prime[j]+i]-value[i]);
                j++;
            }
        }
        System.out.println(ans);
    }
    public static void findPrime(int N,int[] list)
    {
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++)
        {
            isPrime[i] = true;
        }

       
        for (int i = 2; i*i <= N; i++) 
        {
            if (isPrime[i])
            {
                for (int j = i; i*j <= N; j++)
                {
                    isPrime[i*j] = false;
                }
            }
        }
        int j=0;
        for(int i=0;i<=N;i++)
        {
            if(isPrime[i])
                list[j++]=i;
        }
    }
}