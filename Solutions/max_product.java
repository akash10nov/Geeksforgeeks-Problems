/*
 * Given an array with both +ive and -ive integers, return a pair with highest product.
 * input
 * -4,-5,2,4,0,5,4,-2,4,3,-3,6,3,6,-7,1,2,0,4,5,6,7
 * 
 */
import java.io.*;
import java.util.*;
class max_product
{
    public static void main(String[] akash)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input");
        String s=br.readLine();
        String str[]=s.split(",");
        int len=str.length-1;
        int[] a=new int[len+1];
        for(int i=0;i<len;i++)
        {
            a[i]=Integer.parseInt(str[i]);
        }
        int current_max=1;
        int max=0;
        int with_1st_neg;
        int flag=0;
        int last_neg;
        int first_neg;
        int div_f=1;
        int div_l=1;
        int temp_current_max=0;
        for(int i=0;i<len;i++)
        {
           if(a[i]!=0)
            current_max=current_max*a[i];
           if(a[i]<0 && flag==0)
           {
               first_neg=i;
               flag=1;
               div_f=current_max;
            }
            if(a[i]<0 && flag==1)
            {
                last_neg=i;
                temp_current_max=current_max/a[i];
            }
            if(a[i]==0)
            {
                if(current_max>max)
                {
                    max=current_max;
                }
                if(temp_current_max>max)
                {
                    max=temp_current_max;
                }
                if((current_max/div_f)>max)
                {
                    max=(current_max/div_f);
                }
                current_max=1;
                temp_current_max=1;
                div_f=1;
                flag=0;
            }
           
        }
        System.out.println(max);
    }
}