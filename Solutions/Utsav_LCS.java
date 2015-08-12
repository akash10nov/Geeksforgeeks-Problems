import java.io.*;
import java.util.*;
class Utsav_LCS
{
    public static void main(String[] akash) throws IOException
    {
        System.out.println("Input");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
        String s2=br.readLine();
        if(s1.length()<s2.length())
        {
            String temp=s2;
            s2=s1;
            s1=temp;
        }
        int l=s1.length();
        int m=s2.length();
        int a[][]=new int[l+1][m+1];
        for(int i=0;i<l+1;i++)
        {
            a[i][0]=0;
        }
        for(int i=0;i<m+1;i++)
        {
            a[0][i]=0;
        }
        // s1 length l: s2:m
        for(int i=1;i<m+1;i++)
        {
            for(int j=1;j<l+1;j++)
            {
                if(s1.charAt(j-1)==s2.charAt(i-1))
                {
                    a[j][i]=a[j-1][i-1]+1;
                }
                else
                {
                    int max=a[j-1][i];
                    if(max<a[j][i-1])
                        max=a[j][i-1];
                        
                    a[j][i]=max;
                }
            }
        }
        int ans=a[l][m];
        System.out.println(ans);
    }
}