import java.io.*;
import java.util.*;
class Archary
{
       public static void main(String[] args)
       {
           System.out.println("input");
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           long[] radius=new long[n];
           for(int i=0;i<n;i++)
           {
               radius[i]=sc.nextLong();
               radius[i]= radius[i]* radius[i];
           }
           Arrays.sort(radius);
           int m=sc.nextInt();
           long[][] ordinates=new long[m*2][m*2];
           int j=0;
           for(int i=0;i<m;i++)
           {
              ordinates[j][0]=sc.nextLong();
              ordinates[j++][1]=sc.nextLong();
              ordinates[j][0]=sc.nextLong();
              ordinates[j++][1]=sc.nextLong();
           }
           j=0;
           int ans=0;
           for(int i=0;i<m;i++)
           {
             long equation_value_start=(ordinates[j][0]*ordinates[j][0])+(ordinates[j][1]*ordinates[j++][1]);
             long equation_value_end=(ordinates[j][0]*ordinates[j][0])+(ordinates[j][1]*ordinates[j++][1]);
             if(equation_value_start> equation_value_end)
             {
                long temp=equation_value_start;
                equation_value_start=equation_value_end;
                equation_value_end=temp;
             }
             int p=n;
             if(equation_value_start<=radius[n-1])
                p= binary_search(equation_value_start,n,0,n-1,radius);
             else
                p=n;
             int q=n;
             long qq=radius[n-1];
             if(equation_value_end<radius[n-1])
                q=binary_search_end(equation_value_end,n,0,n-1,radius);
             ans=ans+q-p+1;
             
            // int q= binary_search(equation_value_end,0,n-1,radius);
           }
           System.out.println(ans);
           
       }
       static int binary_search(long a,int p,int s,int n, long[] r)
       {
         
           if(a>=r[n-1]&& a<r[n])
                return n;
           else if(a<r[n])
           {
               return binary_search(a,p,s,n/2,r);
            }
           else
           {
               return binary_search(a,p,s,n+((p-n)/2),r);
           }
       }
       static int binary_search_end(long a,int p,int s,int n, long[] r)
       {
         
           if(a>=r[(n/2)-1]&& a<r[n/2])
                return n/2;
           else if(a<r[n/2])
           {
               return binary_search_end(a,p,s,s-(n/2),r);
            }
           else
           {
               return binary_search_end(a,p,n/2,n,r);
           }
       }
}