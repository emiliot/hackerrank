import java.util.Scanner;

/**
 * Created by emiliot on 6/10/16.
 */
public class MaximumSubarray {
    public static final int INF = 0x3f3f3f3f;

    public static int maxContiguous(int array[], int n){
        int best = array[0], next = array[0];
        for(int i=1; i<n; ++i){
            next = Math.max(array[i], array[i] + next);
            best = Math.max(best, next);
        }
        return best;
    }

    public static int maxNonContiguous(int memo[][], int array[], boolean mark[][], int n, int i, int taken){
        if(i >= n)return taken > 0? 0 : -INF;
        if(mark[i][taken])return memo[i][taken];
        mark[i][taken] = true;
        memo[i][taken] = maxNonContiguous(memo, array, mark, n, i+1, taken);
        memo[i][taken] = Math.max(memo[i][taken], maxNonContiguous(memo, array, mark, n, i+1, 1) + array[i]);
        return memo[i][taken];
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        boolean mark[][] = new boolean[100005][2];
        int array[] = new int[100005];
        int memo[][] = new int[100005][2];

        for(int t = 0; t<T; ++t){
            int n = sc.nextInt();
            for(int i=0; i<n; ++i)
                array[i] = sc.nextInt();

            for(int i=0; i<n+1; ++i){
                mark[i][0] = mark[i][1] = false;
            }

            int maxContiguous = maxContiguous(array, n);
            int maxNonContiguous = maxNonContiguous(memo, array, mark, n, 0, 0);
            System.out.println(maxContiguous + " " + maxNonContiguous);
        }
    }
}
