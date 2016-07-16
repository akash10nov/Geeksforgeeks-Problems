import java.io.*;
import java.util.*;
public class sumcountt
{
    public static void main(String[] akash)
    {
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []arr=new int[k];
        for(int i=0;i<k;i++)
            arr[i]=sc.nextInt();
        int ans=countUneatenLeaves(n, arr);
        System.out.println(ans);
    }
      static int countUneatenLeaves(int N, int[] A) {
        int k=A.length;
        int count=0;
        Arrays.sort(A);
        int len=k;
        for(int i=0;i<k;i++)
        {
            for(int j=i+1;j<k;j++)
            {
               if(A[i]!=0 && A[j]!=0)
               {
                    if(A[j]%A[i]==0 )
                    {
                        A[j]=0;
                        len--;
                    }
               }
            }
        }
        int[] B=new int[len];
        int p=0;
      
        for(int i=0;i<k;i++)
        {
            if(A[i]!=0)
                B[p++]=A[i];
        }
        int covered=0;
        for(int i=0;i<len;i++)
        {
            covered+=(N/B[i]);
        }
        int double_covered=0;
        double_covered=count(B,N);
        int ans=N+double_covered-covered;
        /*
        int flag=0;
        for(int i=1;i<=N;i++)
        {
            flag=0;
            for(int j=0;j<len;j++)
            {
                if(i%B[j]==0)
                {
                    flag=1;
                    break;
                }
                
            }
            if(flag==0)
                count++;
        }*/
        return ans;


    }
    static int count(int[] B,int N)
    {
        int[] temp=new int[(int)Math.pow(2,B.length)];
        int j=(int)Math.pow(2,B.length);
        int temp_count=0;
        int[] powerof2=new int[]{1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536};
        for(int i=1;i<=j;i++)
        {
            int ans=1;
            int p=0;
            int q=i;
            int flag=0;
            for(int l=0;l<powerof2.length;l++)
            {
                if(q==powerof2[l])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                
            while(q>=1)
            {
                int temp1=q%2;
                q=q/2;
                if(temp1!=0)
                {
                    if(ans>Math.sqrt(1000000000))
                    {
                        flag=1;
                        break;
                    }
                    ans=ans*temp1*B[p];
                }
 
                p++;
            }
            
                temp_count+=N/ans;
            }
        }
        return temp_count;
    }
}