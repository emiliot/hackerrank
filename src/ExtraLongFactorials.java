import java.util.Scanner;
import java.math.BigInteger;

/**
 * Created by emiliot on 4/29/16.
 */
public class ExtraLongFactorials {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger res = BigInteger.valueOf(1);
        for(;n>0;--n){
            res = res.multiply(BigInteger.valueOf(n));
        }
        System.out.println(res);
    }
}
