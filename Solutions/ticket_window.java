/*
 * link to the problem:
 * http://www.geeksforgeeks.org/linkedin-interview-experience-set-5-campus/
 * iterative solution
 * O(nlogn) time
 * 
 * determine how many windows you will need, i.e. 2 5 8 9 11
 * till 2 ticket use 11
 * till 4 use 9, 11
 * till 13 use 5,9,11
 * so on.
 * get the sum using n(n+1)/2-m(m+1)/2 formula
 * count the remaining ticket..like in case of 7 ticekts your ans here would be 7-4(previous landmark)
 * count for those 3 tickets.
 */
import java.util.*;
import java.io.*;
public class ticket_window
{
    public static void main(String[] akash)
    {
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++)
        {
            input[i]=sc.nextInt();
        }
        Arrays.sort(input);
        int[] difference=new int[n];
        difference[n-1]=0;
        int sum=input[n-1];
        int j=1;
        for(int i=n-2;i>=0;i--)
        {
            difference[i]=sum-(input[i]*j++);
            sum=sum+input[i];
           // System.out.println(difference[i]);
        }
        int flag1=0;
        
        for(int i=n-2;i>=0;i--)
        {
            if(m<=difference[i])
            {
                flag1=i+1;
                break;
            }
        }
        int count=0;
        for(int i=flag1+1;i<n;i++)
        {
            count=count+((input[flag1]+1+input[i])*(input[i]-input[flag1]))/2;
            // formula for continuous number ranging between a and l.
        }
        int remain=m-difference[flag1];
        int mul=remain/(n-flag1);
        int pending=remain%(n-flag1);
        count=count+(mul*((2*input[flag1]*(n-flag1))+(mul-1)*(flag1-n))/2);
        int temp=input[flag1]-mul;
        count=count+temp*pending;
        System.out.println(count);
        
    }
}
    