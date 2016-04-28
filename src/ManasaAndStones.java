import java.util.*;

/**
 * Created by emiliot on 4/25/16.
 */
public class ManasaAndStones {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for(int t=0; t<T; ++t){
            int n = sc.nextInt(),
                a = sc.nextInt(),
                b = sc.nextInt();

            if(n == 1){
                System.out.println(0);
            }else{
//                for(int i=1; i<=n; ++i){
//                    f(i, a, b);
//                }
                f(n, a, b);
            }
        }
    }

    public static void f(int n, int a, int b){
        Set<Integer> result = new TreeSet<>();

        for(int k = 1; k <= n; k++){
            int c1 = n-k,
                    c2 = k-1;
            result.add((a*c1) + (b * c2));
        }

        Iterator<Integer> it = result.iterator();
        System.out.print(it.next());

        for(; it.hasNext();){
            System.out.printf(" %d", it.next());
        }
        System.out.println();
    }
}
