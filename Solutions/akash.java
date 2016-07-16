import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class akash {
    /* Head ends here */
    static int stringReduction(String a) {
        if(a.length()==1)
            return 1;
        else if(a.length()==2)
        {
            if(a.charAt(0)==a.charAt(1))
                return 2;
            else 
                return 1;
        }
        else
        {
            char add=' ';
            if(a.charAt(0)!=a.charAt(1))
            {
                if(a.charAt(0)!='a' && a.charAt(1)!='a')
                {
                    add='a';
                    
                }
                else if(a.charAt(0)!='b' && a.charAt(1)!='b')
                {
                    add='b';
                    
                }
                else if(a.charAt(0)!='c' && a.charAt(1)!='c')
                {
                    add='c';
                    
                }
            
        
            return min(1+stringReduction(a.substring(1)),stringReduction(add+a.substring(2)));
        }
        else
            return 1+stringReduction(a.substring(1));
    }


       
    }
    public static int min(int a,int b)
    {
        int min=a;
        if(min>b)
            min=b;
        
        return min;
    }
    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        System.out.println("input");
        int _t_cases = Integer.parseInt(in.nextLine());
        for (int _t_i = 0; _t_i<_t_cases; _t_i++) {
            String _a = in.nextLine();
            res = stringReduction(_a);
            System.out.println(res);
        }
    }
}
