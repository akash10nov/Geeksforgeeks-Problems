import java.io.*;
import java.util.*;
public class quad
{
    public static void main(String[] akash)throws IOException
    {
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            
            int[] a=new int[4];
            a[0]=sc.nextInt();
            int index=0;
            int max=a[0];
             a[1]=sc.nextInt();
             if(a[1]>max)
             {
                 index=1;
                 max=a[1];
                }
             a[2]=sc.nextInt();
              if(a[2]>max)
             {
                 index=2;
                 max=a[2];
                }
             a[3]=sc.nextInt();
              if(a[3]>max)
             {
                 index=3;
                 max=a[3];
               }
             int sum=0;
             for(int j=0;j<4;j++)
             {
                 if(j!=index)
                    sum+=a[j];
                }
             if(sum>a[index])
                System.out.println("Possible");
             else
                System.out.println("Impossible");
            
            
            
        }
    }
}
