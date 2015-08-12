import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Dirt {

    public static void main(String[] args) 
    {
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int toilets=sc.nextInt();
            int people=sc.nextInt();
            int dirtiness=people/toilets;
            int index=0;
            int temp=people%toilets;
            if(temp==0)
            {
                index=(toilets+1)/2;
            }
                
            else if(toilets%2==0)
            {
                if(temp%2==0)
                    index=toilets+1-(temp/2);
                else
                    index=(temp+1)/2;
            }
            else if(dirtiness%2!=0)
            {
                if(temp%2==0)
                    index=(temp+1)/2;
                else
                    index=toilets-(temp/2);
                
            }
            else
            {
                 if(temp%2==0)
                    index=toilets+1-(temp/2);
                else
                    index=(temp+1)/2;
                
            }
            System.out.println(index+" "+dirtiness);
        }
    }
}