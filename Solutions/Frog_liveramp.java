import java.io.*;
import java.util.*;
public class Frog_liveramp
{
    public static void main(String[] akash)
    {
        System.out.println("Input");
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int ans=Solve(a,X,d);
        System.out.println(ans);
    }
    public static int Solve(int[] A,int X,int D)
    {
        int len = A.length;
        int[] leaf=new int[X+1];
        int lastPosition=0;
        for(int i=0;i<len;i++) {
            if(leaf[A[i]]==0)
                leaf[A[i]]=1;
            if((A[i]-lastPosition)>0 && (A[i]-lastPosition)<=D)
             {
                 lastPosition=A[i];
                 while(lastPosition<=X)
                 {
                     int flag=0;
                         for(int j=D;j>=1;j--)
                         {
                           if(lastPosition+j<=X)
                           {
                             if(leaf[lastPosition+j]==1)
                             {
                                 lastPosition+=j;
                                 flag=1;
                             }
                            }
                         }
                         if(flag==0)
                            break;
                  }
             }
            if(lastPosition+D>=X)
                return i;
                }
        return -1;
    }
}