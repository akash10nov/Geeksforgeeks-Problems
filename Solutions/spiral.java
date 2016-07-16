import java.util.*;
import java.io.*;
public class spiral
{
    public static void main(String[] akash)
    {
        System.out.println("enter size and then the input");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        PrintSpiral(arr,n,0);
    }
    public static void PrintSpiral(int[][] arr,int n,int row)
    {
       for(int i=row;i<n-row;i++)
       {
           System.out.print(arr[i][row]+" ");
       }
       for(int i=row+1;i<n-row;i++)
       {
           System.out.print(arr[n-1-row][i]+" ");
       }
       for(int i=n-row-2;i>row;i--)
       {
           System.out.print(arr[i][n-row-1]+" ");
       }
       for(int i=n-1-row;i>row;i--)
       {
           System.out.print(arr[row][i]+" ");
       }
       if(row>n/2)
       {
       }
        else
        PrintSpiral(arr,n,row+1);
        
    }
}
/*
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 * /
 */