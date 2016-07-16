import java.io.*;
import java.util.*;
class palindrome
{
    public static void main(String[] akash)
    {
    }
    public static int palindrome_check(String s)
    {
        int l=s.length()-1;
        for(int i=0;i<l/2;i++)
        {
            if(s.charAt(i)!=s.charAt(l-i))
            {
                return -1;
            }
        }
        return 0;
    }
}