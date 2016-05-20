import java.util.Scanner;

/**
 * Created by emiliot on 5/20/16.
 */
public class BearAndSteadyGene {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), res = 0;
        StringBuffer s = new StringBuffer(sc.next());

        int acumA[] = new int[s.length()+1];
        int acumC[] = new int[s.length()+1];
        int acumT[] = new int[s.length()+1];
        int acumG[] = new int[s.length()+1];

        for(int i=1; i<=s.length(); ++i){
            char next = s.charAt(i-1);
            acumA[i] = acumA[i-1] + (next == 'A' ? 1 : 0);
            acumC[i] = acumC[i-1] + (next == 'C' ? 1 : 0);
            acumT[i] = acumT[i-1] + (next == 'T' ? 1 : 0);
            acumG[i] = acumG[i-1] + (next == 'G' ? 1 : 0);
        }

        int target = n/4;
        int a = Math.max(0, acumA[s.length()] - target),
            c = Math.max(0, acumC[s.length()] - target),
            t = Math.max(0, acumT[s.length()] - target),
            g = Math.max(0, acumG[s.length()] - target);

        int low = a + c + t + g, high = n+1;
        while(high - low >= 1){
            int mid = (high + low) / 2;
            boolean ok = false;

            for(int k = 0, m = n - mid; k <= m && !ok; ++k){
                int partial = 0;
                if(acumA[k + mid] - acumA[k] >= a)partial++;
                if(acumC[k + mid] - acumC[k] >= c)partial++;
                if(acumT[k + mid] - acumT[k] >= t)partial++;
                if(acumG[k + mid] - acumG[k] >= g)partial++;

                ok = partial >= 4;
            }

            if(ok)high = mid;
            else low = mid+1;
        }
        res = low;

        System.out.println(res);
    }
}
