import java.io.*;
import java.util.*;
public class BuildTree
{
    static int ind=0;
    public static void main(String[] akash)
    {
        int[] in=new int[]{4,2,5,1,6,3};
        int[] pre=new int[]{1,2,4,5,3,6};
        TNode root=buildtree(in,pre,0,5);
        inorder(root);
    }
    public static TNode buildtree(int[] in,int[] pre,int start,int end)
    {
        if(start>end)
            return null;
        TNode t=new TNode(pre[ind++]);
        if(start==end)
            return t;
        
        else
        {
            int index=0;
            for(int i=start;i<=end;i++)
            {
                if(in[i]==t.data)
                {
                    index=i;
                    break;
                }
            }
            t.left=buildtree(in,pre,start,index-1);
            t.right=buildtree(in,pre,index+1,end);
        }
        return t;
    }
    public static void inorder(TNode root)
    {
        TNode t=root;
        if(t.left!=null)
            inorder(t.left);
        System.out.println(root.data);
        if(t.right!=null)
            inorder(t.right);
    }
}