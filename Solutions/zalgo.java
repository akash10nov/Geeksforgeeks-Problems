import java.io.*;
import java.util.*;
public class zalgo {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            String s=sc.next();
            int len=s.length();
            int[] z=new int[len];
            for(int i=0;i<len;i++)
                z[i]=0;
            HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
            for(int i=0;i<len;i++)
            {
                int count=0;
                for(int k=0;(i+k)<len;k++)
                {
                    if(s.charAt(i+k)==s.charAt(k))
                        count++;
                    if(s.charAt(i+k)!=s.charAt(k))
                        break;
                }
                if(hash.containsKey(count))
                {
                    
                    int in=hash.get(count);
                    for(int p=in;p<(in+count);p++)
                    {
                        z[i++]=z[p];
                    }
                }
                else
                {
                    z[i]=count;
                    hash.put(count,i);
                }
                
                
            }
            int f_ans=0;
            for(int i=0;i<len;i++)
                f_ans=f_ans+z[i];
            System.out.println(f_ans);
        }
        
    }
}