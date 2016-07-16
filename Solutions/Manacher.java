import java.io.*;
import java.util.*;
public class Manacher
{
    public static void main(String[] Akash) throws IOException
    {
        /*
         *  M_s= Modified String;
         *  p_size= maximum palindrome size at that point.
         */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the input string");
        String s=br.readLine();
        String M_s="#";
        for(int i=0;i<s.length();i++)
        {
            M_s=M_s+s.charAt(i)+"#";
        }
        int len=M_s.length();
        int[] p_size=new int[len];
        int max=0;
        for(int i=1;i<len;i++)
        {
            if((i+max)>len)
                break;
            for(int j=p_size[i]+1;(i+j)<len;j++)
            {
                if(i>=j)
                {
                    if(M_s.charAt(i-j)==M_s.charAt(i+j))
                       {
                           p_size[i]++;
                           if(p_size[i]>max)
                            max=p_size[i];
                        }
                    else
                       break;
                }
                else
                    break;
            }
            //Use the palindrome length and put p_size value within that range using the mirror value
            for(int k=1;k<p_size[i];k++)
            {
                // Check whether longest palindrome will be bounded or not
                if((p_size[i-k]+(i+k))<(p_size[i]+i))
                {
                    p_size[i+k]=p_size[i-k];
                }
                else
                {
                    i=i+k-1;
                    break;
                }
            }
            
        }
        
            System.out.println(max);
        
        //System.out.println(M_s);
    }
}