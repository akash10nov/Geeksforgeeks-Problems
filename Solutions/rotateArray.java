import java.util.*;
import java.io.*;
class rotateArray
{
    public static void main(String[] akash)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int n=sc.nextInt();
        int [][]in=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                in[i][j]=sc.nextInt();
               
            }
        }
        rotate(in,n,0);
        System.out.println("");
        System.out.println("");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(in[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void rotate(int[][] a,int n,int p)
    {
       
        int temp=a[p][p];
        a[p][p]=a[p+1][p];
        for(int i=p+1;i<(n-p);i++)
        {
            int temp1=a[p][i];
            a[p][i]=temp;
            temp=temp1; 
        }
        for(int i=p+1;i<(n-p);i++)
        {
            int temp1=a[i][n-p-1];
            a[i][n-p-1]=temp;
            temp=temp1;
        }
        for(int i=p+1;i<(n-p);i++)
        {
            int temp1=a[n-p-1][n-i-1];
            a[n-p-1][n-i-1]=temp;
            temp=temp1;
        }
        for(int i=p+1;i<(n-p);i++)
        {
            int temp1=a[n-1-i][p];
            a[n-1-i][p]=temp;
            temp=temp1;
        }
        System.out.println("");
        System.out.println("");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
         p=p+1;
         if((n+1)/2==p)
            return;
         rotate(a,n,p);
    }
}