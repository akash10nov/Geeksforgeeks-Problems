import java.io.*;
import java.util.*;
public class Maze
{
    public static void main(String[] akash)
    {
        System.out.println("Input");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        int [][]ans=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                ans[i][j]=0;
            }
        }
        mazerun(a,n,0,0,ans);
        ans[0][0]=1;
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void mazerun(int[][] a,int n,int i,int j,int[][] ans)
    {
        int flag=0;
        if(j<(n-1))
        {
        if(a[i][j+1]==1)
        {
            if(i==n && (j+1)==n)
            {
                return;
            }
            ans[i][j+1]=1;
            flag=1;
            mazerun(a,n,i,j+1,ans);
            
        }
    }
        if(i<(n-1)){
        if(a[i+1][j]==1)
        {
            if((i+1)==n && j==n)
                return;
                ans[i+1][j]=1;
                flag=1;
            mazerun(a,n,i+1,j,ans);
        }
    }
        if(flag==0)
        {
             for(int p=0;i<n;i++)
             {
                 for(int q=0;j<n;j++)
                 {
                    
                     ans[p][q]=0;
                    }
                }
        }
        {
            return;
        }
    }
}