import java.io.*;
import java.util.*;
public class twosigma {
public static void main(String args[] ) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        long m=sc.nextLong();
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
            array[i]=i;
        int start=0;
        m=m+1;
        String ans="";
        while(m!=0)
        {
            int length=0;
            for(int i=0;i<n;i++)
            {
                if(array[i]!=-1)
                    length++;
            }
            int[] temp=new int[length];
            int k=0;
            for(int i=0;i<n;i++)
            {
                if(array[i]!=-1)
                    temp[k++]=array[i];
            }
            for(int i=0;i<length;i++)
            {
                if(m>fact(length-i-1))
                {
                    int fl=0;
                    for(int j=i;j<length;j++)
                    {
                        
                        if(m>fact(length-i-1))
                            m=m-fact(length-i-1);
                        else
                        {
                            ans=ans+Integer.toString(temp[j]);
                            array[temp[j]]=-1;
                            fl=1;
                            break;
                        }
                    }
                    if(fl==1)
                        break;
                }
                else if(m==fact(length-i-1))
                {
                    for(int j=0;j<length;j++)
                    {
                        ans=ans+Integer.toString(temp[j]);
                        
                    }
                    m=0;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
    public static long fact(int n)
    {
        if(n==0)
            return 1;
        if(n==-1)
            return 1;
        int ans=1;
        int temp=n;
        while(temp!=1)
        {
            ans=ans*temp--;
        }
        return ans;
    }
}