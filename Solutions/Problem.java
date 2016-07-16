//Problem        : Pleasant Walk
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_75
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.Scanner;
import java.io.*;
import java.util.*;
//Your submission should *ONLY* use the following class name
public class Problem
{
    public static void main(String[] args)
    {
       
       Scanner sc = new Scanner(System.in);
       int r=sc.nextInt();
       int c=sc.nextInt();
       int[][] array=new int[2*r+1][2*c+1];
       int row=2*r+1;
       int col=2*c+1;
       for(int i=1;i<row;i=i+2)
       {
           for(int j=1;j<col;j=j+2)
           {
               array[i][j]=-2;
           }
       }
        for(int i=0;i<row;i=i+2)
       {
           for(int j=0;j<col;j=j+2)
           {
               array[i][j]=-1;
           }
       }
       array[0][0]=-2;
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<col;j++)
           {
               if(array[i][j]!=-1 && array[i][j]!=-2)
                    array[i][j]=sc.nextInt();
                else if(array[i][j]==-1)
                    array[i][j]=0;
           }
       }
       
       array[0][0]=0;
       array[row-1][col-1]=0;
       int[][] dp=new int[row][col];

       int ans=Method(array,row-1,col-1,0,0,dp);
       
       System.out.println(ans);
       sc.close();
       
    }
    public static int Method(int[][] a,int r,int c,int i,int j,int[][] dp)
    {
        int ans=0;
       
        if(dp[i][j]!=0)
            return dp[i][j];
        
        if(i==r && j==c)
            return 0;
        if(a[i][j]==-2)
        {
           dp[i][j]=-200;
        }
        else if(i<r && j<c)
        {
           
           dp[i][j]= a[i][j]+Max(Method(a,r,c,i+1,j,dp),Method(a,r,c,i,j+1,dp));
           return dp[i][j];
        }
        else if(i<r)
        {
            dp[i][j]= a[i][j]+Method(a,r,c,i+1,j,dp);
            return dp[i][j];
        }
        else if(j<c)
        {
           dp[i][j]= a[i][j]+Method(a,r,c,i,j+1,dp);
           return dp[i][j];
        }
    
        return a[i][j];
        
    }
    public static int Max(int a,int b)
    {
        if(a>b)
            return a;
        return b;
    }
}
