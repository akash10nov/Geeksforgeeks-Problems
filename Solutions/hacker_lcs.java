import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hacker_lcs {

    public static void main(String[] args)
    {
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
              for(int z=0;z<t;z++)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            int[] c=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(int i=0;i<n;i++)
                b[i]=sc.nextInt();
            for(int i=0;i<n;i++)
                c[i]=sc.nextInt();
            String lcs_ab="";
            lcs_ab=findlcs(a,b,lcs_ab,n);
            String[] temp=lcs_ab.split(" ");
            int len=temp.length;
            int[] lcs_a_b=new int[len];
            for(int i=0;i<len;i++)
                lcs_a_b[i]=Integer.parseInt(temp[i]);
            int ans=findlcslen(c,lcs_a_b,n,len);    
            System.out.println(ans);
              
        }
    }
    public static String findlcs(int[] a,int[] b,String s,int n)
    {
        int ans[][]=new int[n+1][n+1];
        for(int i=0;i<n+1;i++)
        {
            ans[i][0]=0;
        }
        for(int i=0;i<n+1;i++)
        {
            ans[0][i]=0;
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(a[j-1]==b[i-1])
                {
                    ans[j][i]=ans[j-1][i-1]+1;
                }
                else
                {
                    int max=ans[j-1][i];
                    if(max<ans[j][i-1])
                        max=ans[j][i-1];
                        
                    ans[j][i]=max;
                }
            }
        }
        
        
        int i=n;
        int j=n;
        int max=ans[n][n];
        while(max!=0)
        {
            if(ans[i-1][j-1]+1==ans[i][j])
            {   
                s=s+" "+Integer.toString(b[j-1]);
                max--;
                i--;
                j--;
            }
            else if(ans[i-1][j]==ans[i][j])
                i--;
            else
                j--;
        }
        s=ReverseString(s);
        return s;
    }
    public static String ReverseString(String s)
    {
        int len=s.length();
        int i=0;
        int j=len-1;
        char[] chars = s.toCharArray();
        while(i<j)
        {
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            
            i++;
            j--;
        }
        s= new String(chars); 
        return s;
    }
    
    public static int findlcslen(int[] a,int[] b,int l,int m)
    {
        int ans[][]=new int[l+1][m+1];
        int f_ans=0;
        for(int i=0;i<l+1;i++)
        {
            ans[i][0]=0;
        }
        for(int i=0;i<m+1;i++)
        {
            ans[0][i]=0;
        }
        // s1 length l: s2:m
        for(int i=1;i<m+1;i++)
        {
            for(int j=1;j<l+1;j++)
            {
                if(a[j-1]==b[i-1])
                {
                    ans[j][i]=ans[j-1][i-1]+1;
                }
                else
                {
                    int max=ans[j-1][i];
                    if(max<ans[j][i-1])
                        max=ans[j][i-1];
                        
                    ans[j][i]=max;
                }
            }
        }
        return ans[l][m];
    }
}