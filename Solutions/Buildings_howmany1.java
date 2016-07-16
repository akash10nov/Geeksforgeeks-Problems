import java.io.*;
import java.util.*;
public class Buildings_howmany1
{
    
    public static void main(String[] akash)
    {
        System.out.println("Input");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j,k;
        int ans=2;
        if(n>1)
           ans= Count(1,n,1,1,ans); 
        System.out.println(ans*ans);
    }
    public static int  Count(int i,int n,int ones,int zeros,int ans)
    {
        ans=ones+(zeros*2);
        int temp=ones;
        ones=zeros;
        zeros=zeros+temp;
        i=i+1;
        if(i==n)
            return ans;
       return Count(i,n,ones,zeros,ans);
    }
   
}