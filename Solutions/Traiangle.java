import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class traiangle {

    static int obtuse=0;
    static int right=0;
    static int acute=0;
    public static void main(String[] args) {
        System.out.println("input");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int A[] = new int[N];
        for(int A_i=0; A_i < N; A_i++){
            A[A_i] = in.nextInt();
        }
        int[] Square=new int[N];
        for(int i=0;i<N;i++)
        {
            Square[i]=A[i]*A[i];    
        }
        
        count(Square,A,N);
        System.out.println(acute+" "+right+" "+obtuse);
    }
    public static void count(int[] sq,int[] a,int n)
    {
        HashMap<Integer,Integer> hash=new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++)
            hash.put(sq[i],i);
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum=a[i]+a[j];
                
                int index=0;
                index=BinarySearch(sum,a,j,n-1);
                int square=sq[i]+sq[j];
                if(hash.containsKey(square))
                {
                    right++;
                    int r_index=hash.get(square);
                    obtuse+=index-r_index;
                    acute+=r_index-j-1;
                }
                else
                {
                    int r_index=BinarySearch(square,sq,j,index);
                    
                    obtuse+=index-r_index;
                    acute+=r_index-j;
                }
            }
        }
            
       
    }
    
    
    public static int BinarySearch(int n,int[] a,int start,int end)
    {
        if(start==end)
            return start;
        else if(start+1==end)
        {
            if(a[start]<n && a[end]>=n)
                return start;
            else if(a[start]==n)
                return start-1;
            else
                return end;
            
            
        }
        else if(a[(start+end)/2]>=n && (a[((start+end)/2)-1]<n))
           return ((start+end)/2)-1;
        else if(a[(start+end)/2]>=n)
           return BinarySearch(n,a,start,(start+end)/2);
        else
           return BinarySearch(n,a,(start+end)/2,end);
           
    }
}
