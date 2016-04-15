import java.util.Scanner;

/**
 * Created by emiliot on 4/14/16.
 */
public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int t=0; t<T; ++t){
            String next = sc.nextLine();
            if(next.length() % 2 != 0){
                System.out.println(-1);
                continue;
            }

            String a = next.substring(0, next.length() / 2);
            String b = next.substring(next.length() / 2, next.length());

            int res = 0;
            int mark[] = new int[26];
            for(int i=0; i<b.length(); ++i){
                mark[b.charAt(i)-'a']++;
            }

            for(int i=0; i<a.length(); ++i){
                mark[a.charAt(i)-'a']--;
            }

            for(int i=0; i<26; ++i){
                if(mark[i] > 0)
                    res += mark[i];
            }

            System.out.println(res);
        }
    }
}
