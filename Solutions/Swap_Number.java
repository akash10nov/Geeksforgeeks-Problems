import java.util.*;
import java.io.*;
public class Swap_Number
{
    public static void main(String[] akash)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input and then inorder and giver order");
        int n=sc.nextInt();
        int[] inorder=new int[n];
        int[] a=new int[n];
        HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i=i+2)
        {
            inorder[i]=sc.nextInt();
            inorder[i+1]=sc.nextInt();
            hash.put(inorder[i],inorder[i+1]);
            hash.put(inorder[i+1],inorder[i]);
        }
        
        for(int i=0;i<n;i=i+2)
        {
            a[i]=sc.nextInt();
            a[i+1]=sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<n;i=i+2)
        {
            if(hash.get(a[i])==a[i+1])
            {
                    
            }
            else
            {
                int k=hash.get(a[i]);
                for(int j=0;j<n;j++)
                {
                    if(a[j]==k)
                    {
                        int temp=a[i+1];
                        a[i+1]=a[j];
                        a[j]=temp;
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}