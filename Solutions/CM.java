import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CM {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[] K_elements=new int[K];
        for(int i=0;i<K;i++)
        {
            K_elements[i]=sc.nextInt();;   
        }
        Arrays.sort(K_elements);
        int j=0;
        int ans=0;
        for(int i=1;i<=N;i=i+2)
        {
            if((K_elements[j]-i)>1)
                ans++;
            else if((K_elements[j]-i)<-1)
            {
                j++;
                if((K_elements[j]-i)>1)
                    ans++;
            }
                
        }
        ans=ans+K; 
        System.out.println(ans);
    }
}