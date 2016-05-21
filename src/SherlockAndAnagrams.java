import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by emiliot on 5/21/16.
 */
public class SherlockAndAnagrams {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int t = 0; t < T; ++t){
            StringBuffer s = new StringBuffer(sc.next());

            Map<String, Integer> mark = new HashMap<>();

            for(int k = 1, n = s.length(); k < n; ++k){
                for(int i = 0, m = n - k + 1; i<m; ++i){
                    char next[] = s.substring(i, i + k).toCharArray();
                    Arrays.sort(next);
                    String key = new String(next);

                    Integer value = mark.get(key);
                    if(value == null){
                        mark.put(key, 1);
                    }else{
                        mark.put(key, value + 1);
                    }
                }
            }

            long res = 0L;
            for(Map.Entry<String, Integer> entry : mark.entrySet()){
                long next = entry.getValue();
                res += (next * (next - 1L))/2L;
            }
            System.out.println(res);
        }
    }
}
