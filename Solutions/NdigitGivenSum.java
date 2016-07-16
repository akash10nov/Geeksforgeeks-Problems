import java.io.*;
import java.util.*;
public class NdigitGivenSum
{
    static int[][] DP=new int[100][9000];
    public static void main(String[] akash)
    {
        System.out.println("Enter the number of digits & sum:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sc.nextInt();
        for(int i=0;i<100;i++)
        {
            for(int j=0;j<9000;j++)
            {
                DP[i][j]=-1;
            }
        }
        int ans=Firstcount(n,sum);
        System.out.println(ans);
    }
    public static int count(int n,int sum)
    {            
        if(DP[n][sum]!=-1)
            return DP[n][sum];
        if(n==0 && sum!=0)
            return DP[n][sum]=0;
        if(n==0 && sum==0)
            return DP[n][sum]=1;
        int ans=0;
        for(int i=0;i<10;i++)
        {
            if(sum-i>=0)
                ans=ans+count(n-1,sum-i);
        }
        
        return DP[n][sum]=ans;
    }
    public static int Firstcount(int n,int sum)
    {            
         if(DP[n][sum]!=-1)
            return DP[n][sum];
        if(n==0 && sum!=0)
            return DP[n][sum]=0;
        if(n==0 && sum==0)
            return DP[n][sum]=1;
        int ans=0;
        for(int i=1;i<10;i++)
        {
            if(sum-i>=0)
                ans=ans+count(n-1,sum-i);
        }
        
        return ans;
    }
}