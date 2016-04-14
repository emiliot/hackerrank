import java.util.Scanner;

/**
 * Created by emiliot on 4/10/16.
 */
public class GridSearch {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0; t<T; ++t) {
            int R = sc.nextInt(),
                C = sc.nextInt();
            int grid[][] = new int[R][C];
            sc.nextLine();
            for (int i = 0; i < R; ++i) {
                String line = sc.nextLine();
                String[] digits = line.split("");
                for (int j = 0; j < digits.length; ++j) {
                    grid[i][j] = Integer.parseInt(digits[j]);
                }
            }
            int r = sc.nextInt(),
                c = sc.nextInt();
            int pattern[][] = new int[r][c];
            sc.nextLine();
            for (int i = 0; i < r; ++i) {
                String line = sc.nextLine();
                String[] digits = line.split("");
                for (int j = 0; j < digits.length; ++j) {
                    pattern[i][j] = Integer.parseInt(digits[j]);
                }
            }

            boolean res = false;
            for(int i=0; i<R && !res; ++i){
                for(int j=0; j<C && !res; ++j){
                    res = f(grid, pattern, i, j);
                }
            }
            System.out.println(res ? "YES" : "NO");
        }


    }

    private static boolean f(int[][] grid, int[][] pattern, int i, int j) {
        for(int a=0; a < pattern.length; ++a)
            for (int b = 0; b < pattern[a].length; ++b) {
                if(i + a >= grid.length ||
                        j + b >= grid[i+a].length ||
                        grid[i+a][j+b] != pattern[a][b])
                    return false;
            }
        return true;
    }
}
