/*
 * link to the problem:
 * http://www.geeksforgeeks.org/vertex-cover-problem-set-2-dynamic-programming-solution-tree/
 * Dynamic programming
 */
import java.util.*;
import java.io.*;

public class vertex_cover
{   
    public static void main(String[] akash)
    {
        Tree t=new Tree();
        t.insert(8);
        t.root.left=new TNode(8);
        t.root.left.left=new TNode(4);
        t.root.left.right=new TNode(12);
        t.root.left.right.left=new TNode(10);
        t.root.left.right.right=new TNode(14);
        t.root.right=new TNode(22);
        t.root.right.right=new TNode(25);
        int ans=cover(t.root);
        System.out.println(ans);
        
    }  
   
    public static int cover(TNode t)
    {
        if(t==null)
            return 0;
        if(t.left==null && t.right==null)
            return 0;
        int with_root=1+cover(t.left)+cover(t.right);
        int without_root=0;
        if(t.left!=null)
            without_root+=1+cover(t.left.right)+cover(t.left.left);
        if(t.right!=null)
            without_root+=1+cover(t.right.right)+cover(t.right.left);
            
        if(with_root>without_root)
            return without_root;
        else
            return with_root;
    }
}
