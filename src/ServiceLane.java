import java.util.Scanner;

/**
 * Created by emiliot on 4/9/16.
 */
public class ServiceLane {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, T;
        n = sc.nextInt();
        T = sc.nextInt();

        int lane[] = new int[n];
        for(int i=0; i<n; ++i){
            lane[i] = sc.nextInt();
        }

        for(int t = 0; t<T; ++t){
            int a, b, res = 3;
            a = sc.nextInt();
            b = sc.nextInt();

            for(int i = a; i<=b; ++i){
                res = Math.min(res, lane[i]);
                if(res == 1)break;
            }
            System.out.println(res);
        }
    }
}
