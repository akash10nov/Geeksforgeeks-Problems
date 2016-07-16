import java.io.*;
import java.util.*;
public class priorityQ
{
    static class PQsort implements Comparator<Integer> {
 
		public int compare(Integer one, Integer two) {
			return two-one;
		}
	}
    public static void main(String[] akash)
    {
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PQsort p=new PQsort();
        PriorityQueue<Integer> p_queue=new PriorityQueue<Integer>(n,p);
        for(int i=0;i<n;i++)
        {
            p_queue.offer(sc.nextInt());
        }
        System.out.println(p_queue.peek());
        p_queue.remove(p_queue.peek());
        System.out.println(p_queue.peek());
        
        
        
    }
}