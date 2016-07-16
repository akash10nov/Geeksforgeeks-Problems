import java.io.*;
import java.util.*;
class TreeTester
{
    public static void main(String[] akash)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        int n=sc.nextInt();
        Tree t=new Tree();
        for(int i=0;i<n;i++)
        {
            t.insert(sc.nextInt());
        }
        t.traversal(t.root);
        
    }
}