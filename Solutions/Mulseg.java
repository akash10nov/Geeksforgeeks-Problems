import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mulseg {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        long k=sc.nextLong();
        int n=sc.nextInt();
        long[] data=new long[n];
        for(int i=0;i<n;i++)
        {
            data[i]=sc.nextLong();
        }
        /*
        long[][] mat=new long[n][n];
        mat[0][0]=data[0];
        for(int i=1;i<n;i++)
        {
            mat[0][i]=data[i]*mat[0][i-1];
        }
        for(int i=1;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(i==j)
                    mat[i][j]=data[i];
                else
                    mat[i][j]=mat[i][j-1]*data[j];
            }
        }
        int range=n;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(mat[i][j]%k==0)
                {
                    if((j-i+1)<range)
                        range=j-i+1;
                }
            }
        }
        int flag=0;
        if(range==n && mat[0][n-1]%k!=0)
            flag=1;
        if(flag==1)
        {
            System.out.println("NONE");
            return;
        }
        System.out.println("Minimum interval length: "+range);
        System.out.println("Found intervals:");
        for(int i=0;i<(n-range);i++)
        {
            int j=i-1+range;
            if(mat[i][i+range-1]%k==0)
                System.out.println("["+i+1+", "+j+1+"]");
        }
        */
        
        long[] mat=new long[n];
        int range=n;
        for(int i=0;i<n;i++)
        {
            for(int j=i;(j+i)<n;j++)
            {
                if((j-i+1)>range)
                    break;
                if(j==i)
                    mat[j]=data[j];
                else
                    mat[j]=mat[j-1]*data[j];
                if(mat[j]%k==0)
                {
                    if(range>(j-i+1))
                        range=j-i+1;
                }
            }
        }
        long mul=1;
        for(int i=0;i<range;i++)
        {
            mul=mul*data[i];            
        }
        if(mul%k==0)
            System.out.println("["+1+", "+(range+1)+"]");
        if(range==n && mul%k!=0)
        {
            System.out.println("NONE");
            return;
        }
            
        System.out.println("Minimum interval length: "+range);
        System.out.println("Found intervals:");
        for(int i=1;i<(n-range+1);i++)
        {
            mul=mul/data[i-1]*data[i+range-1];
            if(mul%k==0)
                 System.out.println("["+(i+1)+", "+(range+1+i)+"]");
        }
        
    }
}