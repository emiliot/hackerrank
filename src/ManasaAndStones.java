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
                Set<Integer> result = new LinkedHashSet<>();
                for(int k = n-1; k >= 0; k--){
                    result.add((a*k) + (b * (n-k-1)));
                }
                Iterator<Integer> it = result.iterator();
                System.out.print(it.next());

                for(; it.hasNext();){
                    System.out.printf(" %d", it.next());
                }
                System.out.println();
            }
        }
    }
}
