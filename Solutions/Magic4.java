import java.math.BigInteger;
import java.util.Scanner;

public class Magic4 {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("input");
      int T = scanner.nextInt();

      for (int t = 0; t < T; t++) {
         long l = scanner.nextLong();
         long r = scanner.nextLong();
         long res = 0;
         for (long i = 0; i < 32; i++) {
            if ((r - l + 1 == 1))
               if(l%2==1)
               {
                   res=l^r;
                }
                 
            l >>= 1; r >>= 1;
         }
         System.out.println(res);
      }

      scanner.close();
   }


}
