import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlexiTree {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int n=sc.nextInt();
        ArrayList<String>[] list=new ArrayList[n];
        int[] Last_possible=new int[n];
        for(int i=0;i<n-1;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            a=a-1;
            b=b-1;
            String s=sc.next();
            if((list[a]!=null))
            {
                if(list[a].get(0).charAt(0)<s.charAt(0))
                {
                    list[a].clear();
                    list[a].add(s);
                    list[a].add(Integer.toString(b));
                }
                else if(list[a].get(0).equals(s))
                {
                    list[a].add(Integer.toString(b));
                }
                
                
            }
            else
            {
                list[a]=new ArrayList();
                list[a].add(s);
                list[a].add(Integer.toString(b));
                
            }
            
            if((list[b]!=null))
            {
                if(list[b].get(0).charAt(0)<s.charAt(0))
                {
                    list[b].clear();
                    list[b].add(s);
                    list[b].add(Integer.toString(a));
                }
                else if(list[b].get(0).equals(s))
                {
                    list[b].add(Integer.toString(a));
                }
                
                
            }
            else
            {
                list[b]=new ArrayList();
                list[b].add(s);
                list[b].add(Integer.toString(a));
                
            }
        }
        for(int i=0;i<n;i++)
        {
            if(i==3)
            {
                int aaa=0;
            }
            int[] check=new int[n];
            String ans=GetFinalStop(list,check,i);
            String an=ans.substring(ans.length()-1);
            int pr=Integer.parseInt(an)+1;
            System.out.print(pr+" ");
        }
    }
    public static String GetFinalStop( ArrayList<String>[] list,int[] check,int i)
    {
        int j=1;
        check[i]=1;
        String ans="";
        int flag=0;
        while(list[i].get(j)!=null)
        {
            if(check[Integer.parseInt(list[i].get(j))]!=1)
            {
                String temp=list[i].get(0)+GetFinalStop(list,check,Integer.parseInt(list[i].get(j)));
                flag=1;
                if(temp.compareTo(ans)>0)
                    ans=temp;
            }
            
            j++;
            if(j==list[i].size())
                break;
        }
        if(flag==0)
            return Integer.toString(i);
        return ans;
    }
}