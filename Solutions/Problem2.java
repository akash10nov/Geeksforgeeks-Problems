//Problem        : All Paths Lead to Bunny Hills
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_75
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.*;
//Your submission should *ONLY* use the following class name
public class Problem2
{
    public static void main(String[] args)
    {

       Scanner sc=new Scanner(System.in);
       System.out.println("input");
       int row=sc.nextInt();
       int col=sc.nextInt();
       int s_row=sc.nextInt();
       int s_col=sc.nextInt();
       int[][] mat=new int[row][col];
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<col;j++)
           {
               mat[i][j]=sc.nextInt();
           }
        }
       int start_row=s_row;
       int start_col=s_col;
       int max=0;
      
       if(s_col+1<=col-1)
       {
           if(mat[s_row][s_col]> mat[s_row][s_col+1])
           {
               int ans1=1+Method(mat,start_row,start_col+1,row,col,mat[s_row][s_col]-mat[s_row][s_col+1],1);
               if(max<ans1)
                    max=ans1;
           }
        }
        if(s_row+1<=row-1)
       {
           if(mat[s_row][s_col]> mat[s_row+1][s_col])
           {
               int ans1=1+Method(mat,start_row+1,start_col,row,col,mat[s_row][s_col]-mat[s_row+1][s_col],1);
               if(max<ans1)
                    max=ans1;
           }
        }
       if(s_row-1!=-1)
       {
           if(mat[s_row][s_col]> mat[s_row-1][s_col])
           {
               int ans1=1+Method(mat,start_row-1,start_col,row,col,mat[s_row][s_col]-mat[s_row-1][s_col],1);
               if(max<ans1)
                    max=ans1;
           }
        }
       if(s_col-1!=-1)
       {
           if(mat[s_row][s_col]> mat[s_row][s_col-1])
           {
               int ans1=1+Method(mat,start_row,start_col-1,row,col,mat[s_row][s_col]-mat[s_row][s_col-1],1);
               if(max<ans1)
                    max=ans1;
           }
        }
       System.out.println(max);
        
    }
    public static int Method(int[][] mat,int s_row,int s_col,int row,int col,int diff,int unit)
    {
        int max=0;
        int start_row=s_row;
        int start_col=s_col;
        
        if(s_row+1<row)
       {
           if(mat[s_row][s_col]- mat[s_row+1][s_col]==diff)
           {
               int ans1=1+Method(mat,start_row+1,start_col,row,col,mat[s_row][s_col]-mat[s_row+1][s_col],unit++);
               if(max<ans1)
                    max=ans1;
           }
           if( unit>=5 && mat[s_row][s_col]- mat[s_row+1][s_col]==-1)
           {
               int ans1=1+Method(mat,start_row+1,start_col,row,col,mat[s_row][s_col]-mat[s_row+1][s_col],0);
               if(max<ans1)
                    max=ans1;
           }
           
        }
       if(s_col+1<col)
       {
           if(mat[s_row][s_col]- mat[s_row][s_col+1]==diff)
           {
               int ans1=1+Method(mat,start_row,start_col+1,row,col,mat[s_row][s_col]-mat[s_row][s_col+1],unit++);
               if(max<ans1)
                    max=ans1;
           }
           if(unit>=5 && mat[s_row][s_col]- mat[s_row][s_col+1]==-1)
           {
               int ans1=1+Method(mat,start_row,start_col+1,row,col,diff,0);
               if(max<ans1)
                    max=ans1;
           }
           
        }
       if(s_row-1!=-1)
       {
           if(mat[s_row][s_col]- mat[s_row-1][s_col]==diff)
           {
               int ans1=1+Method(mat,start_row-1,start_col,row,col,diff,unit++);
               if(max<ans1)
                    max=ans1;
           }
           if(unit>=5 && mat[s_row][s_col]- mat[s_row-1][s_col]==-1)
           {
               int ans1=1+Method(mat,start_row-1,start_col,row,col,diff,0);
               if(max<ans1)
                    max=ans1;
           }
        }
       if(s_col-1!=-1)
       {
           if(mat[s_row][s_col]- mat[s_row][s_col-1]==diff)
           {
               int ans1=1+Method(mat,start_row,start_col-1,row,col,mat[s_row][s_col]-mat[s_row][s_col-1],unit++);
               if(max<ans1)
                    max=ans1;
           }
           if(unit>=5 && mat[s_row][s_col]- mat[s_row][s_col-1]==-1)
           {
               int ans1=1+Method(mat,start_row,start_col-1,row,col,diff,0);
               if(max<ans1)
                    max=ans1;
           }
        }
        return max;
    }

}
