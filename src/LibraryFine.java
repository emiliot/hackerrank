import java.util.Scanner;

/**
 * Created by emiliot on 4/20/16.
 */
public class LibraryFine {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(),
            m = sc.nextInt(),
            y = sc.nextInt();

        int ed = sc.nextInt(),
            em = sc.nextInt(),
            ey = sc.nextInt();

        if(y < ey || (y == ey && m < em) || (y == ey && m == em && d <= ed)) System.out.println(0);
        else if(y == ey && m == em) System.out.println(15 * (d - ed));
        else if(y == ey) System.out.println(500 * (m - em));
        else System.out.println(10000);
    }
}
