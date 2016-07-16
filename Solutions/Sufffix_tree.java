import java.io.*;
import java.util.*;

public class Sufffix_tree
{
    public static void main( String[] akash)
    {
        System.out.println(" Enter the String");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s+'$';
        SufNode root=new SufNode(1);
        buildSuffixTree(s,root);
        System.out.println("Insert compare String");
        String in=sc.next();
        in=in+'$';
        CheckSuffix(in,root);
    }
    public static void buildSuffixTree(String s,SufNode r)
    {
        for(int i=s.length()-1;i>=0;i--)
        {
            String a=s.substring(i);
            SufNode t=r;
            for(int j=0;j<(a.length()-1);j++)
            {
                if(a.charAt(i)=='a')
                {
                    if(t.Achild!=null)
                    {
                        t=t.Achild;
                    }
                    else
                        t.Achild=new SufNode(1);
                }
                else if(a.charAt(i)=='b')
                {
                    if(t.Bchild!=null)
                    {
                        t=t.Bchild;
                    }
                    else
                        t.Bchild=new SufNode(1);
                }
                else if(a.charAt(i)=='c')
                {
                    if(t.Cchild!=null)
                    {
                        t=t.Cchild;
                    }
                    else
                        t.Cchild=new SufNode(1);
                }
                else if(a.charAt(i)=='d')
                {
                    if(t.Dchild!=null)
                    {
                        t=t.Dchild;
                    }
                    else
                        t.Dchild=new SufNode(1);
                }
                else if(a.charAt(i)=='e')
                {
                    if(t.Echild!=null)
                    {
                        t=t.Echild;
                    }
                    else
                        t.Echild=new SufNode(1);
                }
                else if(a.charAt(i)=='f')
                {
                    if(t.Fchild!=null)
                    {
                        t=t.Fchild;
                    }
                    else
                        t.Fchild=new SufNode(1);
                }
                else if(a.charAt(i)=='g')
                {
                    if(t.Gchild!=null)
                    {
                        t=t.Gchild;
                    }
                    else
                        t.Gchild=new SufNode(1);
                }
                else if(a.charAt(i)=='h')
                {
                    if(t.Hchild!=null)
                    {
                        t=t.Hchild;
                    }
                    else
                        t.Hchild=new SufNode(1);
                }
                else if(a.charAt(i)=='i')
                {
                    if(t.Ichild!=null)
                    {
                        t=t.Ichild;
                    }
                    else
                        t.Ichild=new SufNode(1);
                }
                else if(a.charAt(i)=='j')
                {
                    if(t.Jchild!=null)
                    {
                        t=t.Jchild;
                    }
                    else
                        t.Jchild=new SufNode(1);
                }
                else if(a.charAt(i)=='k')
                {
                    if(t.Kchild!=null)
                    {
                        t=t.Kchild;
                    }
                    else
                        t.Kchild=new SufNode(1);
                }
                else if(a.charAt(i)=='l')
                {
                    if(t.Lchild!=null)
                    {
                        t=t.Lchild;
                    }
                    else
                        t.Lchild=new SufNode(1);
                }
                else if(a.charAt(i)=='m')
                {
                    if(t.Mchild!=null)
                    {
                        t=t.Mchild;
                    }
                    else
                        t.Mchild=new SufNode(1);
                }
                else if(a.charAt(i)=='n')
                {
                    if(t.Nchild!=null)
                    {
                        t=t.Nchild;
                    }
                    else
                        t.Nchild=new SufNode(1);
                }
                else if(a.charAt(i)=='o')
                {
                    if(t.Ochild!=null)
                    {
                        t=t.Ochild;
                    }
                    else
                        t.Ochild=new SufNode(1);
                }
                else if(a.charAt(i)=='p')
                {
                    if(t.Pchild!=null)
                    {
                        t=t.Pchild;
                    }
                    else
                        t.Pchild=new SufNode(1);
                }
                else if(a.charAt(i)=='q')
                {
                    if(t.Qchild!=null)
                    {
                        t=t.Qchild;
                    }
                    else
                        t.Qchild=new SufNode(1);
                }
                else if(a.charAt(i)=='r')
                {
                    if(t.Rchild!=null)
                    {
                        t=t.Rchild;
                    }
                    else
                        t.Rchild=new SufNode(1);
                }
                else if(a.charAt(i)=='s')
                {
                    if(t.Schild!=null)
                    {
                        t=t.Schild;
                    }
                    else
                        t.Schild=new SufNode(1);
                }
                else if(a.charAt(i)=='t')
                {
                    if(t.Tchild!=null)
                    {
                        t=t.Tchild;
                    }
                    else
                        t.Tchild=new SufNode(1);
                }
                else if(a.charAt(i)=='u')
                {
                    if(t.Uchild!=null)
                    {
                        t=t.Uchild;
                    }
                    else
                        t.Uchild=new SufNode(1);
                }
                else if(a.charAt(i)=='v')
                {
                    if(t.Vchild!=null)
                    {
                        t=t.Vchild;
                    }
                    else
                        t.Vchild=new SufNode(1);
                }
                else if(a.charAt(i)=='w')
                {
                    if(t.Wchild!=null)
                    {
                        t=t.Wchild;
                    }
                    else
                        t.Wchild=new SufNode(1);
                }
                else if(a.charAt(i)=='x')
                {
                    if(t.Xchild!=null)
                    {
                        t=t.Xchild;
                    }
                    else
                        t.Xchild=new SufNode(1);
                }
                else if(a.charAt(i)=='y')
                {
                    if(t.Ychild!=null)
                    {
                        t=t.Ychild;
                    }
                    else
                        t.Ychild=new SufNode(1);
                }
                else if(a.charAt(i)=='z')
                {
                    if(t.Zchild!=null)
                    {
                        t=t.Zchild;
                    }
                    else
                        t.Zchild=new SufNode(1);
                }
                else
                    t.END=new SufNode(1);
                
            }
        }
    }
    public static void CheckSuffix(String s, SufNode r)
    {
        
    }
}