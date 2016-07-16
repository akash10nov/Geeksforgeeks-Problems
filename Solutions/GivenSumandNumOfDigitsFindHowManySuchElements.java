import java.io.*;
import java.util.*;
public class GivenSumandNumOfDigitsFindHowManySuchElements
{
    public static void main(String[] akash)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter N and then Sum");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sc.nextInt();
        int[][] Knap=new int[n][sum+1];
        Process(n,sum,Knap);
        /*
         * 
         * Knapsack Problem with the constraint that 0 can't be the first element
         * 
         * 
         */
    }
    public static void Process(int n,int sum, int[][] Knap)
    {
        
    }
}