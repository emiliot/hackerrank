import java.util.Scanner;

/**
 * Created by emiliot on 4/15/16.
 */
public class PalindromeIndex {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for(int t = 0; t<T; ++t){
            String next = sc.nextLine();
            int res = f(next);
            System.out.println(res);
        }
    }

    public static int f(String s){
        int a = -1, b = -1;
        for(int i=0, n=s.length()/2; i<n; ++i){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                a = i;
                b = s.length() - i - 1;
                break;
            }
        }
        if(a != -1){
            String s1 = s.substring(0, a) + s.substring(a + 1),
                s2 = s.substring(0, b) + s.substring(b + 1);
            if(isPalindrome(s1))
                return a;
            if(isPalindrome(s2))
                return b;
        }
        return -1;
    }

    public static boolean isPalindrome (String s){
        for(int i=0, n=s.length()/2; i<n; ++i){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
