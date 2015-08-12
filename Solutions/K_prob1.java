import java.io.*;
import java.util.*;
class K_prob1
{
    public static void main(String[] akash)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("insert the string");
        String s=br.readLine();
        s=s.replace(" ","%20");
        System.out.println(s);
    }
}