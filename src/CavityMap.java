import java.util.Scanner;

/**
 * Created by emiliot on 4/11/16.
 */
public class CavityMap {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        String grid[] = new String[n];
        StringBuffer res[] = new StringBuffer[n];
        sc.nextLine();
        for(int i=0; i<n; ++i){
            grid[i] = sc.nextLine();
            res[i] = new StringBuffer(grid[i]);
        }

        int movi[] = {-1, 0, 0, 1},
            movj[] = {0, -1, 1, 0};

        for(int i=1; i<n-1; ++i){
            for(int j=1; j<n-1; ++j){
                char next = grid[i].charAt(j);
                boolean ok = true;
                for(int k=0; k<4; ++k){
                    int ni = i + movi[k],
                        nj = j + movj[k];
                    if(next <= grid[ni].charAt(nj))
                        ok = false;
                }
                if(ok)
                    res[i].setCharAt(j, 'X');
            }
        }

        for(int i=0; i<n; ++i){
            System.out.println(res[i]);
        }
    }
}
