import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Imba {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            if(n%2==0)
            {
               
                for(int i=0;i<(n/2);i++)
                {
                    System.out.print(i+1+" ");
                    System.out.print(((n/2)+1+i) + " ");
                }
                System.out.println("");
            }
            else
            {
                System.out.print(((n+1)/2) +" ");
                for(int i=0;i<(n/2);i++)
                {
                    System.out.print(i+1+" ");
                    System.out.print(((n/2)+1+1+i) + " ");
                }
                System.out.println("");
            }
        }
    }
}