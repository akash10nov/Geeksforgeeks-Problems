import java.util.Hashtable;
import java.util.*;


public class HashMapHashtableExample {
    
    public static void main(String[] args) { 
 
           
  
        Hashtable<String,String> hashtableobj = new Hashtable<String, String>();
        hashtableobj.put("Alive is ", "awesome");
        hashtableobj.put("Lodadae", "aaaayouradself");
        hashtableobj.put("Love", "yourself");
        
        System.out.println("Hashtable object output :"+ hashtableobj);
 
         
 
        HashMap hashmapobj = new HashMap();
        hashmapobj.put("Alive is ", "awesome");  
        hashmapobj.put("Love", "yourself"); 
         hashmapobj.put("Lodadae", "aaaayouradself");
        System.out.println("HashMap object output :"+hashmapobj);   
 
 }
}