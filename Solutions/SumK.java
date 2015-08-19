
/*
*	Check if from given element you can make a sum total of K
*/
import java.io.*;
import java.util.*;
class SumK
{
    public static void main(String[] akash)
    {
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int ans=KsumExist(a,0,n-1,k);
        if(ans>0)
            System.out.println("it exists");
        else
            System.out.println("No it doesnt exist");
    }
    public static int KsumExist(int[] a,int s,int e,int k)
    {
        if(a[s]==k)
            return 1;
        if(s==e)
            return 0;
        return KsumExist(a,s+1,e,k-a[s])+ KsumExist(a,s+1,e,k);
    }
}