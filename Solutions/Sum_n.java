/*
 * Link:
 * http://www.geeksforgeeks.org/count-sum-of-digits-in-numbers-from-1-to-n/
 */
import java.io.*;
import java.util.*;
class Sum_n
{
    public static void main(String[] akash)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the inupt number: ");
        String N_s=br.readLine();
        int N=Integer.parseInt(N_s);
        int ans=(N*(N+1))/2;
        System.out.println(ans);
    }
}