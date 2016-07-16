import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class time {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("shoot");
        int hour=sc.nextInt();
        
        String[] s=new String[]{"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
        String[] time;
        time=new String[] {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four"," twenty five","twenty six"," twenty seven","twenty eight","twenty nine","thirty"};
        int minutes=sc.nextInt();
        if(minutes==45)
            {
             System.out.println(" quater to "+s[hour]);
        }
        else if(minutes<30)
               {
                    System.out.println(time[minutes-1]+" past to "+s[hour-1]);
               }
       else if(minutes>30)
           {
            hour=hour+1;
            minutes=60-minutes;
             System.out.println(time[minutes-1]+" minutes to "+s[hour-1]);
            }
        else if(minutes==30)
            {
            System.out.println(" half past "+s[hour-1]);
        }
       else if(minutes==0)
            System.out.println(s[hour-1]+"o' clock");
        
        
        
    }
}