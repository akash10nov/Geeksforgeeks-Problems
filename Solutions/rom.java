import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class rom {

    public static void main(String[] args) {
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] Arr=new int[n][n];
        for(int i=0;i<m;i++)
        {
            int x=0;
            int y=0;
                
            for(int j=0;j<1;j++)
            {
                x=sc.nextInt();
                y=sc.nextInt();
            }
            if(i%2==0)
                Arr[x-1][y-1]=2;
            else
                Arr[x-1][y-1]=1;
        }
        if(((m/2)+1)<=n)
        {
            System.out.println("NEITHER");
            return;
        }
        
        
        
        int roman_flag=0;
        int persian_flag=0;
        int rom=(m+1)/2;
        int per=m/2;
        
        
        
        for(int i=0;i<(n-1);i++)
        {
            int temp=rom;
            int t_f=0;
            for(int j=0;j<(n-1);j++)
            {
                if(Arr[j][i]==2)
                {
                    if(i>0){
                        if(Arr[j+1][i]==2 || Arr[j+1][i-1]==2)
                        {
                            t_f=1;
                        }
                    }
                    else
                    {
                         if(Arr[j+1][i]==2)
                        {
                            t_f=1;
                        }
                    }
                    rom--;
                }
            }
            if(rom<(n-1-i) || rom==temp || t_f==0)
            {
                roman_flag=1;
                break;
            }
        }
        for(int i=0;i<(n-1);i++)
        {
            int temp=per;
            int t_f=0;
            for(int j=0;j<(n-1);j++)
            {
                
                if(Arr[i][j]==1)
                {
                    if(j>0){
                            if(Arr[i+1][j]==1 || Arr[i+1][j-1]==1)
                            {
                                t_f=1;
                            }
                        }
                     else
                     {
                         if(Arr[i+1][j]==1)
                            {
                                t_f=1;
                            }
                         
                     }
                         per--;
                     }
                }
            if(per<(n-1-i) || per==temp || t_f==0)
            {
                persian_flag=1;
                break;
            }
        }
        if(roman_flag==0){
        for(int i=0;i<n;i++)
        {
            int ans=0;
            if(Arr[i][0]==2)
            {
                ans=CheckRoman(i,0,Arr,n-1);
                    
            }
            if(ans==1)
            {
                System.out.println("ROMANS");
                return;
            }
        }
        }
        if(persian_flag==0)
        {
        for(int i=0;i<n;i++)
        {
            int ans=0;
            if(Arr[0][i]==1)
            {
                ans=CheckPersian(0,i,Arr,n-1);
                    
            }
            if(ans==1)
            {
                System.out.println("PERSIANS");
                return;
            }
        }
        }
        
        System.out.println("NEITHER");
    }
    
    public static int CheckRoman(int i,int j, int[][] Arr,int n)
    {
     
        Arr[i][j]=-2;
        if(j==n)
            return 1;
        if((j+1)<=n)
        {
            if((i-1)>=0)
            {
                 if(Arr[i-1][j+1]==2)
                 {
                     int a=CheckRoman(i-1,j+1,Arr,n);
                     if(a==1)
                        return 1;
                 }
            }
            if(Arr[i][j+1]==2)
            {
                int a=CheckRoman(i,j+1,Arr,n);
                if(a==1)
                        return 1;
            }
        }
        
        if((i-1)>=0)
        {
            if(Arr[i-1][j]==2)
            {
                int a=CheckRoman(i-1,j,Arr,n);
                if(a==1)
                        return 1;
            }
        }
        if((i+1)<=n)
        {
            if(Arr[i+1][j]==2)
            {
               int a= CheckRoman(i+1,j,Arr,n);
               if(a==1)
                        return 1;
            }
            if((j-1)>=0)
            {
                if(Arr[i+1][j-1]==2)
                {
                    int a=CheckRoman(i+1,j-1,Arr,n);
                    if(a==1)
                        return 1;
                }
            }
        }
        if(j-1>=0)
        {
            if(Arr[i][j-1]==2)
            {
                int a=CheckRoman(i,j-1,Arr,n);
                if(a==1)
                        return 1;
            }
        }
       
        return 0;
            
    }
    public static int CheckPersian(int i,int j, int[][] Arr,int n)
    {
        
        Arr[i][j]=-2;
        if(i==n)
            return 1;
        if((i+1)<=n)
        {
            if(Arr[i+1][j]==1)
            {
                int a=CheckPersian(i+1,j,Arr,n);
                if(a==1)
                    return 1;
            }
            if((j-1)>=0)
            {
                if(Arr[i+1][j-1]==1)
                {
                    int a= CheckPersian(i+1,j-1,Arr,n);
                    if(a==1)
                        return 1;
                }
                
            }
        }
        if(j-1>=0)
        {
            if(Arr[i][j-1]==1)
            {
                int a=CheckPersian(i,j-1,Arr,n);
                if(a==1)
                        return 1;
            }
        }
        if((j+1)<=n)
        {
            if(Arr[i][j+1]==1)
            {
                int a=CheckPersian(i,j+1,Arr,n);
                if(a==1)
                        return 1;
            }
            if((i-1)>=0)
            {
                 if(Arr[i-1][j+1]==1)
                 {
                     int a=CheckPersian(i-1,j+1,Arr,n);
                     if(a==1)
                        return 1;
                 }
            }
            
        }
        if((i-1)>=0)
        {
            if(Arr[i-1][j]==1)
            {
                int a=CheckPersian(i-1,j,Arr,n);
                if(a==1)
                        return 1;
            }
        }
            return 0;
    }
}