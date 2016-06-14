import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by emiliot on 6/10/16.
 */
public class FibonacciModified {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(),
                b = sc.nextInt(),
                n = sc.nextInt();

        BigInteger memo[] = new BigInteger[30];
        memo[0] = BigInteger.ZERO;
        memo[1] = BigInteger.valueOf(a);
        memo[2] = BigInteger.valueOf(b);

        for(int i = 3; i<=n; ++i){
            memo[i] = memo[i-2].add(memo[i-1].multiply(memo[i-1]));
        }

        System.out.println(memo[n]);
    }
}
