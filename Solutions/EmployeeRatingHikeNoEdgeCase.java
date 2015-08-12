import java.io.*;
import java.util.*;
class EmployeeRatingHikeNoEdgeCase
{
    public static void main(String[] akash) throws IOException
    {
        System.out.println("input");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String stream=br.readLine();
        String[] a=stream.split(" ");
        int len=a.length;
        int[] in=new int[len];
        for(int i=0;i<len;i++)
        {
            in[i]=Integer.parseInt(a[i]);
        }
        int sum=0;
        int last=1;
        int count=1;
        int same=0;
        if(in[0]>in[1])
            {
                last=0;
            }
        else
            sum=1;
        for(int i=1;i<len;i++)
        {
            if(in[i]>in[i-1])
            {
                if(count>1)
                {
                    sum=sum-last+(count*(count+1)/2)-same;
                    last=1;
                    count=1;
                }
                sum=sum+last+1;
                last=last+1;
            }
            else if(in[i]==in[i-1])
            {
                if(count==1)
                    sum=sum+last;
                else
                {
                    count++;
                    same++;
                }
            }
            else if(in[i]<in[i-1])
            {
                count++;
            }
        }
         if(count>1)
         {
               sum=sum-last+(count*(count+1)/2)-same;
               count=1;
         }
         
         System.out.println(sum);
    }
}