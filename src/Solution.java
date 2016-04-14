import java.util.Scanner;

/**
 * Created by emiliot on 4/8/16.
 */
public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();

        int v[] = new int[n];
        for(int i=0; i<n; i++){
            v[i] = sc.nextInt();
        }

        int res = 0;
        for(int i=0, page=1; i<n; ++i){
            for(int j=1; j<=v[i]; ++j){
                if(j == page)++res;
                if(j % k == 0)++page;
            }
            if(v[i] % k > 0){
                page++;
            }
        }
        System.out.println(res);
    }

}
