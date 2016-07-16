import java.io.*;
import java.util.*;
public class Coin_Problem
{
    public static void main(String[] akash)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int m=sc.nextInt();
        int[] coins=new int[m];
        for(int i=0;i<m;i++)
        {
            coins[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int[] array=new int[n+1];
        int ans=count_coin(n,coins,array);
        System.out.println("ans is:"+ ans);
    }
    public static int count_coin(int n,int[] coin,int[] array)
    {
       int min=n;
       for(int i=0;i<coin.length;i++)
       {
           if(n-coin[i]>0)
           {
               int temp=0;
               if(array[n-coin[i]]==0)
                     temp=1+count_coin(n-coin[i],coin,array);
               else
                    temp=1+array[n-coin[i]];
               if(min>temp)
                    min=temp;
           }
           else if(n-coin[i]==0)
           {
               array[n]=1;
               return 1;
           }
       }
       array[n]=min;
       return array[n];
    }
}