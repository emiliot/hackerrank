import java.util.Scanner;

/**
 * Created by emiliot on 6/14/16.
 */
public class CoinChange {

    public static long f(long memo[][], boolean mark[][], int coins[], int m, int n, int i){
        if(n == 0)return 1;
        if(n < 0 || (n > 0 && i >= m))return 0;

        if(mark[n][i])return memo[n][i];
        mark[n][i] = true;
        memo[n][i] = f(memo, mark, coins, m, n, i+1);

        if(coins[i] <= n)
            memo[n][i] += f(memo, mark, coins, m, n - coins[i], i);

        return memo[n][i];
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();

        int coins[] = new int[m];
        for(int i=0; i<m; ++i){
            coins[i] = sc.nextInt();
        }

        long memo[][] = new long[n+1][m+1];
        boolean mark[][] = new boolean[n+1][m+1];

        long res = f(memo, mark, coins, m, n, 0);
        System.out.println(res);
    }
}
