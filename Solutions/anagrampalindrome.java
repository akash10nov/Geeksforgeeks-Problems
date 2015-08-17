import java.io.*;
import java.util.HashMap;
import java.util.*;
class anagrampalindrome
{
    public static void main(String[] akash) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        String s=br.readLine();
        int len=s.length();
        HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
        for(int i=0;i<len;i++)
        {
            if(hash.containsKey(s.charAt(i)))
            {
                int k=hash.get(s.charAt(i));
                hash.put(s.charAt(i),k+1);
            }
            else
                hash.put(s.charAt(i),1);
        }
        Set st=hash.entrySet();
        Iterator i=st.iterator();
        int count=0;
        while(i.hasNext())
        {
            Map.Entry m=(Map.Entry)i.next();
            int a=(int)(m.getValue());
            if(a%2!=0)
                count++;
            if(count>1)
            {
                System.out.println("No anagram possible");
                return;
            }
        }
        System.out.println("palimdrome of some anagram exists");
        
                
    }
}