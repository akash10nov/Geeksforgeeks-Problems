import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Camper {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[] K_elements=new int[K];
        for(int i=0;i<K;i++)
        {
            K_elements[i]=sc.nextInt(); 
        }
        Arrays.sort(K_elements);
        int ans=0;
        for(int i=0;i<=K;i++)
        {
            if(i==0)
            {
                ans=(K_elements[i]+1)/2;
            }
            else if(i<(K))
            {
                ans=ans+((K_elements[i]-K_elements[i-1]+1)/2);
            }
            else
            {
                ans+=(N+1-K_elements[K-1])/2;
            }
        }
        System.out.println(ans);
    }
}