import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pairs_sabre
{
    static int pairs(int[] a,int k) {
      /* Complete this function */
        HashMap<Integer ,Integer> hash=new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++)
            hash.put(a[i],1);
        Set st=hash.entrySet();
        Iterator i=st.iterator();
        int count=0;
        int flag=0;
        int ans=0;
        int remove=0;
        while(i.hasNext())
        {
            
            Map.Entry m=(Map.Entry)i.next();
            
            int temp=(int)(m.getKey());
            if(flag==1)
                hash.remove(remove);
            remove=temp;
            if(hash.containsKey(temp+2))
            {
                ans++;
                //hash.remove(temp+k);
            }
             if(hash.containsKey(temp-k))
            {
                ans++;
                //hash.remove(temp-k);
            }
            flag=1;
        } 
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        System.out.println("input");
        String n = in.nextLine();
        String[] n_split = n.split(" ");
        
        int _a_size = Integer.parseInt(n_split[0]);
        int _k = Integer.parseInt(n_split[1]);
        
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = pairs(_a,_k);
        System.out.println(res);
    }
}
