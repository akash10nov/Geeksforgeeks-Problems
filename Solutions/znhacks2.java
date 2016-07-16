import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class znhacks2 {

    public static void main(String[] args)
    {
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        HashMap<shoe,Integer> Data=new HashMap<shoe,Integer>();
        for(int i=0;i<n;i++)
        {
            String s=sc.nextLine();
            String[] s_array=s.split(" ");
            
            shoe temp=new shoe(s_array[0],s_array[2],Integer.parseInt(s_array[1]),s_array[3]);
            if(Data.containsKey(temp))
            {
                int freq=Data.get(temp);
                freq=freq+1;
                Data.put(temp,freq);
            }
            else
            {
                Data.put(temp,1);
            }
        }
        Set st=Data.entrySet();
        Iterator i=st.iterator();
        int count=0;
        int flag=0;
        int ans=0;
        while(i.hasNext())
        {
             Map.Entry m=(Map.Entry)i.next();
            shoe temp=(shoe)m.getKey();
            int freq1=Data.get(temp);
            Data.put(temp,0);
            if(temp.type.equals("L"))
            {
                temp.type="R";
                if(Data.containsKey(temp))
                {
                    int freq2=Data.get(temp);
                    if(freq1>freq2)
                        ans+=freq2;
                    else
                        ans+=freq1;
                    Data.put(temp,0);
                }
                
            }
            if(temp.type.equals("R"))
            {
                temp.type="L";
                if(Data.containsKey(temp))
                {
                    int freq2=Data.get(temp);
                    if(freq1>freq2)
                        ans+=freq2;
                    else
                        ans+=freq1;
                    Data.put(temp,0);
                }
                
            }
        }
        System.out.println(ans);
    }
}
class shoe
{
    String Brand;
    String color;
    int size;
    String type;
    public shoe(String b,String c,int s,String t)
    {
        Brand=b;
        color=c;
        size=s;
        type=t;
    }
}