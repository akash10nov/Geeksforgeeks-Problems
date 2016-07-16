import java.io.*;
import java.util.*;
class TwoStringAnagram
{
    public static void main(String[] akash) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input: 2 strings: different Lines: 1st one should be bigger");
        String s1=br.readLine();// should be bigger
        String s2=br.readLine();
        int len=s2.length();
        HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
        HashMap<Character,Integer> hash1=new HashMap<Character,Integer>();
        for(int i=0;i<len;i++)
        {

            if(hash.containsKey(s2.charAt(i)))
            {
                int k=hash.get(s2.charAt(i));
                hash.put(s2.charAt(i),k+1);
            }
            else
                hash.put(s2.charAt(i),1);
        }
         for(int i=0;i<len;i++)
        {
            
            if(hash1.containsKey(s1.charAt(i)))
            {
                int k=hash1.get(s1.charAt(i));
                hash1.put(s1.charAt(i),k+1);
            }
            else
                hash1.put(s1.charAt(i),1);
        }
        int j=0;
        for(int i=len;i<s1.length();i++)
        {
            if(hash1.equals(hash))
            {
                System.out.println("It exists.");
                return;
            }
            else
            {
                
            if(hash1.containsKey(s1.charAt(i)))
            {
                int k=hash1.get(s1.charAt(i));
                hash1.put(s1.charAt(i),k+1);
            }
            else
                hash1.put(s1.charAt(i),1);
                
                int p=hash1.get(s1.charAt(j));
                if(p==1)
                    hash1.remove(s1.charAt(j++));
                else
                    hash1.put(s1.charAt(j++),p-1);
            }
        }
        
        System.out.println("It does not exists");
       
    }
}