import java.util.Scanner;

/**
 * Created by emiliot on 4/28/16.
 */
public class AcmIcpcTeam {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        String abilities[] = new String[n];
        sc.nextLine();

        for(int i=0; i<n; ++i){
            abilities[i] = sc.nextLine();
        }

        int count [] = new int [m+1];
        int res = 0;
        for(int i=0; i<n; ++i){
            for(int j=i+1; j<n; ++j){
                int next = getAbilities(abilities[i], abilities[j], m);
                count[next] += 1;
                res = Math.max(res, next);
            }
        }

        System.out.println(res);
        System.out.println(count[res]);
    }

    private static int getAbilities(String a, String b, int m) {
        int res = 0;
        for(int i=0; i<m; i++){
            int next = 0;
            if(a.charAt(i) == '1')next = Math.min(next + 1, 1);
            if(b.charAt(i) == '1')next = Math.min(next + 1, 1);
            res += next;
        }
        return res;
    }
}
