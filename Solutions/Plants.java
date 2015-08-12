import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Plants {

    public static void main(String[] args) 
    {
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] plants=new int[n];
        for(int i=0;i<n;i++)
        {
            plants[i]=sc.nextInt();
        }
        int small=plants[0];
        int smaller=plants[0];
        int count=0;
        if(plants[1]>plants[0])
            count=1;
        int count_max=count;
        for(int i=1;i<n;i++)
        {
            if(plants[i-1]>plants[i])
            {
                if(plants[i]>smaller)
                {
                    count++;
                }
                else
                {
                    smaller=plants[i];
                }
            }
            if(plants[i]<=small)
            {
                if(count>count_max)
                    count_max=count;
                small=plants[i];
                smaller=plants[i+1];
                count=0;
                if(i<(n-1))
                {
                    if(plants[i+1]>small)
                        count++;
                }
            }
        }
        if(count>count_max)
            System.out.println(count);
        else
            System.out.println(count_max);
        
    }
}