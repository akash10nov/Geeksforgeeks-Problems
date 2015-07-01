/*
 * link to the problem:
 * http://www.geeksforgeeks.org/count-numbers-from-1-to-n-that-have-4-as-a-a-digit/
 * Approach: find the answer for 10,100,1000... store these values. now get the digits
 * one by one and multiply with stored answer accordingly
 * i.e
 * 123
 * 10->1
 * 100->19
 * so 1*19+2*1+(check number is greater than 4 or not)
 */
import java.io.*;
import java.util.*;
public class Count_of_4
{
    public static void main(String[] akash)throws IOException
    {
        System.out.println("Shoot the input:");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String temp_=br.readLine();
        int n=Integer.parseInt(temp_);
        int temp=n;
        int len=0;
        while(temp!=0)
        {
            temp=temp/10;
            len++;
        }
        System.out.println(len);
        int[] digit=new int[len];
        int i=len-1;
        temp=n;
        while(temp!=0)
        {
            digit[i--]=temp%10;
            temp=temp/10;
        }
        int count=0;
        temp=n;
        int remember[]=new int[len-1];
        for(i=0;i<len-1;i++)
        {
            remember[len-2-i]=count*9+(int)(Math.pow(10,i));
            count=remember[len-2-i];
        }
        count=0;
       for(i=0;i<len-1;i++)
       {
           count=count+(digit[i])*remember[i];
           if(digit[i]>4)
            count=count+(int)(Math.pow(10,len-1-i));
        }
       if(digit[len-1]>=4)
        count=count+1;
       System.out.println(count);
    }
}
