import java.io.*;
import java.util.*;
class seedFinder
{
       public static void main(String[] Akash)throws IOException
       {
           System.out.println("give me N,K ,F(k)'s");
           Scanner sc=new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String t=br.readLine();
            String[] splited = t.split(" ");
            int n=Integer.parseInt(splited[0]);
            int k=Integer.parseInt(splited[1]);
           // System.out.println(n);
            //System.out.println(k);
            String t1=br.readLine();
            String[] FKS = t1.split(" ");
            int len_f=FKS.length;
            long[] F=new long[k];
            String t2=br.readLine();
            String[] CS = t2.split(" ");
            int len_c=CS.length;
            long[] C=new long[len_c];
            for(int i=0;i<len_f;i++)
            {
                F[k-i-1]=Long.parseLong(FKS[i]);
                C[i]=Long.parseLong(CS[i]);
            }
          long[] r=new long[len_c+1];
          for(int i=0;i<len_c;i++)
          {
              r[i]=F[k-i-1];
            }
          long[] result=new long[len_c];
          result=Method(r,C,(k-n),len_c);
          for(int i=0;i<n;i++)
            System.out.print(result[i]+" ");
            
        }

public static long[] Method(long[] f,long[] c,int p,int len_c)
{
    if(p==-1)
        return f;
    else
        {
               long sum=0;
            for(int i=0;i<len_c;i++)
            {
                sum=sum+(f[i+1]*c[i]);
            }
            
            long result=(f[0]-sum)/c[len_c-1];
            f[len_c]=result;
            System.out.println(result);
             for(int i=0;i< len_c;i++)
            {
                f[i]=f[i+1];
            }
            f[len_c]=0;
            p=p-1;
            return Method(f,c,p,len_c);
            
            
        }
       
        
}
}