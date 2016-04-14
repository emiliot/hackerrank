import java.util.Scanner;

/**
 * Created by emiliot on 4/13/16.
 */
public class GemStones {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count[] = new int[26];
        for(int i=0; i<n; ++i){
            String next = sc.nextLine();
            boolean mark[] = new boolean[26];
            for(int j=0; j<next.length(); ++j){
                mark[next.charAt(j) - 'a'] = true;
            }
            for(int j=0; j<26; ++j)
                if(mark[j])count[j]++;
        }

        int res = 0;
        for(int i=0; i<26; ++i){
            if(count[i] == n)res++;
        }
        System.out.println(res);
    }
}
