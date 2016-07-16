/*
 * Link to the problem:
 * http://www.geeksforgeeks.org/kth-largest-element-in-a-stream/
 */
import java.util.*;
import java.io.*;
class kth_largest_Heap
{
    public static void main(String[] akash) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input");
        String input=br.readLine();
        String in_s[]=input.split(",");
        int len=in_s.length;
        String K_s=br.readLine();
        int k=Integer.parseInt(K_s);
        int[] in=new int[len];
        for(int i=0;i<len;i++)
        {
            in[i]=Integer.parseInt(in_s[i]);
        }
        int[] heap=new int[k];
        
        for(int i=0;i<k;i++)
        {
            heap[i]=in[i];
        }
        for(int i=k-1;i>=1;i--)
        {
            heapify(heap,i);
        }
       
        for(int i=k;i<len;i++)
        {
            if(in[i]<heap[0])
            {
                heap[0]=in[i];
                trickledown(heap,0);
                
            }
            System.out.println(heap[0]);
        }
      
    }
    public static void heapify(int[] a,int index)
    {
        if(a[(index-1)/2]<a[index])
        {
            int temp=a[(index-1)/2];
            a[(index-1)/2]=a[index];
            a[index]=temp;
            if(((index*2)+1)<a.length)
            {
                heapify(a,(2*index)+1);
            }
            if(((index*2)+2)<a.length)
            {
                heapify(a,(2*index)+2);
            }
        }
      
        
    }
    public static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    public static void trickledown(int[] a,int index)
    {
        
        if(((2*index)+1)<a.length)
        {
            if(a[index]<a[(2*index)+1])
            {
                int temp=a[(2*index)+1];
                a[(2*index)+1]=a[index];
                a[index]=temp;
                trickledown(a,(2*index)+1);
            }
        }
        if(((2*index)+2)<a.length)
        {
            if(a[index]<a[(2*index)+2])
            {
                int temp=a[(2*index)+2];
                a[(2*index)+2]=a[index];
                a[index]=temp;
                trickledown(a,(2*index)+2);
            }
        }
            
    }
}