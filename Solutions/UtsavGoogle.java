import java.io.*;
import java.util.*;
public class UtsavGoogle
{
    public static void main(String[] akash) throws IOException
    {
        System.out.println("Enter the string");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hash=new HashMap<String, Integer>();
        int j=0;
        hash.put("i",j++);
        hash.put("love",j++);
        hash.put("ice",j++);
        hash.put("cream",j++);
        hash.put("icecream",j++);
        
        String s=br.readLine();
        ArrayList<String> a=new ArrayList<String>();
        ArrayList<ArrayList<String>> ans=new ArrayList<ArrayList<String>>();
        method(s,hash,a,ans,s.length());
        System.out.println(ans);
    }
    public static void method(String s, HashMap<String,Integer> hash,ArrayList<String> a,ArrayList<ArrayList<String>> ans,int n)
    {
        for(int i=0;i<s.length();i++)
        {
            String temp=s.substring(0,i+1);
            String temp1=s.substring(i+1);
            if(hash.containsKey(s.substring(0,i+1)))
            {
                if(i==s.length()-1)
                {
                    ArrayList<String> x=a;
                    x.add(s.substring(0,i+1));
                    ans.add(x);
                }
                else
                {
                   
                    ArrayList<String> x=new ArrayList<String>(a);
                    x.add(s.substring(0,i+1));
                    method(s.substring(i+1),hash,x,ans,n);
                }
            }
            
            
        }
        return;
    }
}