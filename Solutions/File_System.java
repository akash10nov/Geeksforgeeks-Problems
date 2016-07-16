import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class File_System {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("n and everything");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] s=new String[N];
        int[][] str=new int[N][300];
        for(int i=0;i<N;i++)
        {
             s[i]=br.readLine();
        }
        for(int i=0;i<N;i++)
        {
             String[] temp=s[i].split(" ");
             int len=Integer.parseInt(temp[0]);
             int[] temp_int=new int[len];
             for(int j=0;j<len;j++)
             {
                 temp_int[j]=Integer.parseInt(temp[j+1]);
             }
             Arrays.sort(temp_int);
             for(int j=0;j<len;j++)
             {
                 str[i][j]=temp_int[j];
             }
        }
        int Q=Integer.parseInt(br.readLine());
        String[] p=new String[Q];
        for(int i=0;i<Q;i++)
        {
            p[i]=br.readLine();
            String[] temp=p[i].split("\\s");
            
            int type=Integer.parseInt(temp[0]);
            int size=Integer.parseInt(temp[1]);
            int[] query=new int[size];
            for(int j=0;j<size;j++)
            {
                query[j]=Integer.parseInt(temp[j+2]);
            }
            Arrays.sort(query);
            if(type==1)
            {
                int count=0;
                for(int j=0;j<N;j++)
                {
                    int[] sentence=new int[300];
                    int length=0;
                    for(int ee=0;ee<300;ee++)
                    {
                        if(str[j][ee]== 0)
                        {
                            length=ee;
                            break;
                        }
                        sentence[ee]=str[j][ee];
                    }
                    int flag=0;
                    int lim=0;
                    for(int k=0;k<size;k++)
                    {
                        flag=0;
                        int ex=query[k];
                        for(int l=lim;l<length;l++)
                        {
                            int ex1=sentence[l];
                            if(query[k]==sentence[l])
                            {
                                lim=l+1;
                                flag=1;
                                break;
                            }
                        }
                        if(flag==0)
                            break;
                        if(k==(size-1) && flag==1)
                            count++;
                }
            }
                System.out.println(count);
            }
            else if(type==2)
            {
               int count=0;
                for(int j=0;j<N;j++)
                {
                    int[] sentence=new int[300];
                    int length=0;
                    for(int ee=0;ee<300;ee++)
                    {
                        if(str[j][ee]== 0)
                        {
                            length=ee;
                            break;
                        }
                        sentence[ee]=str[j][ee];
                    }
                    int flag=0;
                    int lim=0;
                    for(int k=0;k<size;k++)
                    {
                        flag=0;
                        int ex=query[k];
                        for(int l=lim;l<length;l++)
                        {
                            int ex1=sentence[l];
                            if(query[k]==sentence[l])
                            {
                                lim=l+1;
                                flag=1;
                                break;
                            }
                        }
                        if(flag==1)
                         {
                            count++;
                            break;
                        }
                }
            }
                System.out.println(count);   
            }    
            else if(type==3)
            {
                int count=0;
                for(int j=0;j<N;j++)
                {
                    int[] sentence=new int[300];
                    int length=0;
                    for(int ee=0;ee<300;ee++)
                    {
                        if(str[j][ee]== 0)
                        {
                            length=ee;
                            break;
                        }
                        sentence[ee]=str[j][ee];
                    }
                    int flag=0;
                    int lim=0;
                    for(int k=0;k<size;k++)
                    {
                       
                        int ex=query[k];
                        for(int l=lim;l<length;l++)
                        {
                            int ex1=sentence[l];
                            if(query[k]==sentence[l])
                            {
                                lim=l+1;
                                flag++;
                                break;
                            }
                        }
                      
                        if(k==(size-1) && flag<size && flag>0)
                            count++;
                }
            }
                System.out.println(count);
            }
        }   
    }
}