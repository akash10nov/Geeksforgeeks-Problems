/* Enter your code here. Read input from STDIN. Print output to STDOUT */
import java.io.*;
import java.util.*;
public class StringReduction {

	static boolean flag=false;
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
                int n=Integer.parseInt(stdin.readLine());
                String s;
                    for(int i=0;i<n;i++){
                        s=stdin.readLine();
                        Solution sr = new Solution();
                        System.out.println(StringReduction.reduced(s));
                    }
	}
	public static int reduced(String s)
	{
		if(s.length()==1){
			flag=true;
			return 1;
		}	
		char c = s.charAt(0);
		boolean fl=true;
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i)!=c){
				fl = false;
				break;
			}
		}
		if(fl){
			if(s.length()==2)
				flag = true;
			return s.length();
		}
		
		int max=s.length(),m=0;
		for (int i = 0; i < s.length()-1 && !flag; i++) {
			if(s.charAt(i)!=s.charAt(i+1)){
				StringBuffer b = new StringBuffer(0);
				b.insert(0, s);
				c = 'a' ^ 'b' ^ 'c';
				c = (char) (c ^ s.charAt(i) ^ s.charAt(i+1));
				b.delete(i,i+2);
				b.insert(0, c);
				System.out.println(b);
				m = reduced(b.toString());
				m = max < m ? max:m;
			}
		}
		
		
		return m;
	}
	
	

}