import java.io.*;
import java.util.*;
public class JobsProblem
{
    public static void main(String[] akash)throws IOException
    {
        System.out.println("Enter the time slots");
       
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        
        String[] temp=s.split(",");
        int[] time=new int[temp.length];
        for(int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }
        HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        for(int i=0;i<temp.length;i++)
        {
            String[] s_temp=temp[i].split("-");
            time[i]=Integer.parseInt(s_temp[0]);
            int b=Integer.parseInt(s_temp[1]);
            hash.put(time[i],b);
        }
        int[] people=new int[temp.length];
        Arrays.sort(time);
        for(int i=0;i<temp.length;i++)
        {
            for(int j=0;j<temp.length;j++)
            {
                if(time[i]>=people[j])
                {
                    people[j]=hash.get(time[i]);
                    break;
                }
            }
        }
        int count=0;
        for(int j=0;j<temp.length;j++)
        {
            if(people[j]==0)
            {
                count=j;
                break;
            }
        }
        System.out.println(count);
    }
}