import java.io.*;
import java.util.*;
public class knapsack
{
    public static void main(String[] akash)
    {
        System.out.println("Enter the input:");
        Scanner sc=new Scanner(System.in);
        int W=sc.nextInt();
        int n=sc.nextInt();
        int[] weight=new int[n];
        int[] val=new int[n];
        for(int i=0;i<n;i++)
        {
            weight[i]=sc.nextInt();
            val[i]=sc.nextInt();
        }
        
        int profit=MaxProfit(weight,val,W);
        System.out.println(profit);
        
    }
    public static int MaxProfit(int[] wt,int[] v, int W)
    {
        int n=wt.length;
        int[][] DP=new int[n+1][W+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=W;j++)
            {
                if(i==0 || j==0)
                    DP[i][j]=0;
                else if(j>=wt[i-1])
                {
                    DP[i][j]=max(DP[i-1][j],v[i-1]+DP[i-1][j-wt[i-1]]);
                }
                else
                    DP[i][j]=DP[i-1][j];
                
            }
        }
        return DP[n][W];
    }
    public static int max(int a,int b)
    {
        if(a>b)
            return a;
        return b;
    }
}