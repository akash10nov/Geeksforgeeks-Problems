import java.io.*;
import java.util.*;
/*
 *             Checked for an array 1,3,5,7,9,11
 * 
 * 
 * 
 */
class Segment_tree
{
    public static void main(String[] akash)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int[] powerof2=new int[]{1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536};
        int size=(2*n)-1;
        for(int i=0;i<powerof2.length;i++)
        {
            if(size<=powerof2[i])
            {
                size=powerof2[i];
                break;
            }
        }
        int num=sc.nextInt();
        int[] b=new int[size];
        int ans= build_seg_tree(a,b,0,0,n-1);
        for(int i=0;i<num;i++)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans1=lookup(b,l,r,0,n-1,0);
            System.out.println(ans1);
        }
        
    }
    public static int build_seg_tree(int[] a,int[] b,int i,int l,int r)
    {
       int mid=(l+r)/2;
       if(l==mid && mid==r)
       {
            b[i]=a[l];
            return a[l];
        }
      else if(l==mid && mid+1==r)
      {
          b[(2*i)+1]=a[l];
          b[(2*i)+2]=a[r];
          b[i]=a[l]+a[r];
          return b[i];
      }
      else if(r==(mid+1))
       {
            b[(2*i)+2]=a[r];
            b[i]= a[r]+build_seg_tree(a,b,(2*i)+1,l,mid);
            return b[i];
        }
       if((mid+1)==r)
       {
           b[i]=a[r];
           return a[r];
        }
       b[i]= build_seg_tree(a,b,(2*i)+1,l,mid)+build_seg_tree(a,b,(2*i)+2, mid+1,r);
       return  b[i];
       
    }
    public static int lookup(int[] b,int l,int r,int i,int n,int s)
    {
        int mid=(i+n)/2;
        if(l>n && r>n) 
            return 0;
        else if(l<i && r<i)
            return 0;
        else if(i==l && r==n)
            return b[s];
        else if(i>=l && n<=r)
            return b[s];
        else if(l>=i && r<=mid)
        {
            return lookup(b,l,r,i,mid,(2*s)+1);
        }
        else if(l>mid)
           return lookup(b,l,r,mid+1,n,(2*s)+2);
        else if(l>=i && r>mid)
        {
            return lookup(b,l,r,i,mid,(2*s)+1)+lookup(b,l,r,mid+1,n,(2*s)+2);
        }
        else if(r<n && r>l)
            return lookup(b,l,r,i,mid,(2*s)+1)+lookup(b,l,r,mid+1,n,(2*s)+2);
        else
            return 0;
    }
}