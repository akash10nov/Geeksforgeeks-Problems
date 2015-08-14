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
        int ans=count_coin(n,coins);
        System.out.println("ans is:"+ans);
    }
    public static int count_coin(int n,int[] coin)
    {
        int len=coin.length;
        for(int i=0;i<len;i++)
        {
            if(coin[i]==n)
                return 1;
        }
        int p=0;
        int min=n;
        for(int i=0;i<len;i++)
        {
            if(n-coin[i]>=0)
                p=1+count_coin(n-coin[i],coin);
            if(p<min && p!=0)
                min=p;
        }
        return min;
    }
}