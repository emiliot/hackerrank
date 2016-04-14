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

            String a = next.substring(0, next.length() / 2)
                    .chars().sorted()
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            String b = next.substring(next.length() / 2, next.length())
                    .chars().sorted()
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            int res = 0;
            int markA[] = new int[26];
            int markB[] = new int[26];

            for(int i=0, n=a.length(); i<n; ++i){
                markA[a.charAt(i) - 'a']++;
                markB[b.charAt(i) - 'a']++;
            }

            System.out.println(res);
        }
    }
}
