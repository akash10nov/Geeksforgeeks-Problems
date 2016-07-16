import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class touch_segment {

     public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int q=0;q<t;q++)
        {
            int N=sc.nextInt();
            int[][] limit=new int[N][2];
            int[][] limit1=new int[N][2];
          //  HashMap<Integer, Integer> hashmap = new HashMap<>();
           // HashMap<Integer, Integer> hashmap_2nd_max = new HashMap<>();
            int[] result=new int[N];
            for(int o=0;o<N;o++)
            {
                limit[o][0]=sc.nextInt();
                limit[o][1]=sc.nextInt();
                result[o]=0;
            }
            
                for(int j=0;j<N;j++)
                {
                    for(int i=0;i<N;i++)
                    {
                        if(limit[j][0]>=limit[i][0] && limit[j][1]<=limit[i][1])
                            result[j]=result[j]+1;
                        else if(limit[i][0]<=limit[j][1] && limit[i][0]>=limit[j][0])
                            result[j]=result[j]+1;
                            
                    }
                }
             int rem=0;
            int max=0;
            int max1=0;
            for(int i=0;i<N;i++)
            {
              if(result[i]>max)
              {
                  max=result[i];
                  rem=i;
                }
            }
             for(int i=0;i<N;i++)
            {
              result[i]=0;
            }
            for(int i=0;i<N;i++)
                    {
                        int p=limit[i][0];
                        int lll=limit[i][1];
                        if(limit[rem][0]>=limit[i][0] && limit[rem][1]<=limit[i][1])
                        {
                            limit1[i][0]=-3;
                            limit1[i][1]=-3;
                        }
                        else if(limit[rem][0]<=limit[i][0] && limit[rem][1]>=limit[i][0])
                           {
                               limit1[i][0]=-3;
                               limit1[i][1]=-3;
                            }
                        else
                        {
                             limit1[i][0]=limit[i][0];
                            limit1[i][1]=limit[i][1];
                        }
                    }
          int flag=0;
           for(int j=0;j<N;j++)
                {
                    if(limit1[j][0]>-2){
                    for(int i=0;i<N;i++)
                    {
                        if(limit1[j][0]>=limit1[i][0] && limit1[j][1]<=limit1[i][1])
                            result[j]=result[j]+1;
                            
                    }
                }
                }
             for(int i=0;i<N;i++)
            {
              if(result[i]>max1)
              {
                  max1=result[i];
                  rem=i;
                }
            }
            int fin_ans=max+max1;
            int ll=q+1;
            System.out.print("Case "+ll+": ");
            System.out.println(fin_ans);
        }
    }
}