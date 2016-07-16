import java.io.*;
import java.util.*;
public class zenefits2
{
    static int ans_len=0;
    public static void main(String[] akash)
    {
        HashMap<String,Integer> hash=new HashMap<String,Integer>();
        System.out.println("inputt");
        hash.put("dog",1);
        hash.put("catcher",1);
        hash.put("dogcatcher",1);
        hash.put("rain",1);
        hash.put("coat",1);
        hash.put("raincoat",1);
        ArrayList<String> a=new ArrayList<String>();
        String[] dict=new String[]{"dog","catcher","dogcatcher","raincoat","rain","coat"};
        int leng=0;
        for(int i=0;i<dict.length;i++)
        {
            hash.remove(dict[i]);
            methods(dict[i],hash,a);
            hash.put(dict[i],1);
        }
        System.out.println(ans_len);
    }
    public static void methods(String s, HashMap<String,Integer> hash,ArrayList<String> a)
    {
        for(int i=0;i<s.length();i++)
        {
            //String temp=s.substring(0,i+1);
            //String temp1=s.substring(i+1);
            if(hash.containsKey(s.substring(0,i+1)))
            {
                if(i==s.length()-1)
                {
                    ArrayList<String> x=a;
                    x.add(s.substring(0,i+1));
                    Iterator it=x.iterator();
                    
                    int cur=0;
                    for(int q=0;q<x.size();q++)
                    {
                        cur=cur+x.get(q).length();
                    }
                    if(cur>ans_len)
                        ans_len=cur;
                }
                else
                {
                    ArrayList<String> x=new ArrayList<String>(a);
                    x.add(s.substring(0,i+1));
                    methods(s.substring(i+1),hash,x);
                }
            }
            
            
        }
        return;
    }
}
