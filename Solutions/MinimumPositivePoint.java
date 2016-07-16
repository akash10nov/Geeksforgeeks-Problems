import java.io.*;
import java.util.*;
public class MinimumPositivePoint
{
    public static void main(String[] akash)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input");
        int n=sc.nextInt();
        int[][] in=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                in[i][j]=sc.nextInt();
            }
        }
        int current=in[0][0];
        int ans=minpath(in,current,n);
        
    }
    public static int minpath(int[][] in, int current,int n)
    {
        if(in[0][0]>0)
            current=0;
        else if(in[0][0]==0)
            current=1;
        else
            current=Math.abs(in[0][0]);
        int[][] dp=new int[n][n];
        dp[0][0]=Math.max(current, in[0][0]);
        for(int i=1;i<n;i++)
        {
            dp[0][i]=dp[0][i-1]+in[0][i];
            dp[i][0]=dp[i-1][0]+in[i][0];
            
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                dp[i][j]=Math.max(dp[i-1][j]+in[i][j],1);
                dp[i][j]=Math.max(dp[i][j],in[i][j]+dp[i][j-1]);
            }
        }
        return dp[n-1][n-1];
        
    }
}