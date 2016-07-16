import java.util.*;
import java.io.*;
public class DeshpandeyGoogle
{
    public static final int max=65535;
    public static void main(String[] akash)
    {
        System.out.println("Enter the input");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        int[][] b=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
                b[i][j]=max;
            }
        }
        int ans=minpath(a,b,0,0,n,m,0);
        if(ans>max)
            System.out.println("no such path");
        else
            System.out.println(ans);
    }
    public static int minpath(int[][] a,int[][] b,int i,int j,int n,int m,int level)
    {
        if(i==(n-1) && j==(m-1))
            return 0;
        else
        {
            if(i<n-1 && j<m-1)
            {
            if(b[i+1][j]!=max || b[i][j+1]!=max)
                return 1+min(b[i+1][j],b[i][j+1]);
            
            else {
                
                if(a[i][j+1]>level && a[i+1][j]>level)
                    return b[i][j]=1+min(minpath(a,b,i+1,j,n,m,level+1),minpath(a,b,i,j+1,n,m,level+1));
                else if(a[i][j+1]>level)
                    return b[i][j]=1+minpath(a,b,i,j+1,n,m,level+1);
                else if(a[i+1][j]>level)
                    return b[i][j]=1+minpath(a,b,i+1,j,n,m,level+1);
                else
                    return max+5;
                }
            }
            else if(i<n-1)
            {
                if(b[i+1][j]<max)
                    return 1+b[i+1][j];
                else  if(a[i+1][j]>level)
                    return b[i][j]=1+minpath(a,b,i+1,j,n,m,level+1);
                else
                    return max;
                
            }
            else if(j<m-1)
            {
                if(b[i][j+1]<max)
                    return 1+b[i][j+1];
                else  if(a[i][j+1]>level)
                    return b[i][j]=1+minpath(a,b,i,j+1,n,m,level+1);
                else
                    return max;
                
            }
            else 
                return max;
        }
    }
    public static int min(int a,int b)
    {
        if(a>b)
            return b;
        return a;
    }
}