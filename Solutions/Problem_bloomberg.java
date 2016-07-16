//Problem        : Optimal Word Finder
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_75
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.*;
import java.io.*;
//Your submission should *ONLY* use the following class name
public class Problem_bloomberg
{
    public static void main(String[] args) throws IOException
    {

       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("input");
       String s=br.readLine();
       String []temp=s.split(" ");
       int len=temp.length;
       int[] weight=new int[len/2];
       int j=0;
       int even=0;
       int odd=0;
       for(int i=0;i<len;i++)
       {
           if(i%2!=0)
           {
               weight[j++]=Integer.parseInt(temp[i]);
               if(weight[j-1]%2==0)
                    even++;
               else 
                    odd++;
           }
       }
       br.close();
      Arrays.sort(weight);
      for(int i=0;i<weight.length/2;i++)
      {
          int temp1=weight[i];
          weight[i]=weight[weight.length-1-i];
          weight[weight.length-1-i]=temp1;
        }
       int[] odd_member=new int[odd];
       int[] even_member=new int[even];
       j=0;
       int k=0;
       for(int i=0;i<len/2;i++)
       {
           if(weight[i]%2==0)
                even_member[j++]=weight[i];
           else
                odd_member[k++]=weight[i];
       }
       int ans=0;
       if(odd==even || odd==even+1)
       {
           int limit=0;
           if(len/2>8)
           {
                limit=8;
               for(int i=0;i<limit/2;i++)
               {
                   ans+=even_member[i];
                }
               for(int i=0;i<limit/2;i++)
               {
                   ans+=odd_member[i];
               }
            }
            else
            {
                for(int i=0;i<len/2;i++)
                    ans+=weight[i];
            }
       }
       else if(odd> even)
       {
           if(even>=4)
           {
               for(int i=0;i<4;i++)
               {
                   ans+=odd_member[i];
                }
               for(int i=0;i<4;i++)
               {
                   ans+=even_member[i];
                }
            }
            else
            {
                for(int i=0;i<even+1;i++)
               {
                   ans+=odd_member[i];
                }
               for(int i=0;i<even;i++)
               {
                   ans+=even_member[i];
                }
            }
       }
       else if(even>odd)
       {
           if(odd>=4)
           {
               for(int i=0;i<4;i++)
               {
                   ans+=odd_member[i];
                }
               for(int i=0;i<4;i++)
               {
                   ans+=even_member[i];
                }
            }
            else
            {
                 for(int i=0;i<odd;i++)
               {
                   ans+=odd_member[i];
                }
               for(int i=0;i<odd;i++)
               {
                   ans+=even_member[i];
                }
            }
        }
        System.out.println(ans);
    }

}
