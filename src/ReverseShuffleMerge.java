import java.util.Scanner;

/**
 * Created by emiliot on 6/6/16.
 */
public class ReverseShuffleMerge {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        sb.reverse();

        int count[] = new int[26];
        int partial[] = new int[26];

        for(int i=0; i<sb.length(); ++i){
            count[sb.charAt(i) - 'a']++;
        }

        for(int i=0; i<26; ++i) {
            count[i] /= 2;
        }

        //try to build a string with the required characters in count
        //keep in mind the order inside sb

        char res[] = new char[sb.length()/2];
        int want[] = new int[26];
        int have[] = new int[26];

        for(int i=0, n=sb.length()/2; i<n; ++i){
            for(int ch = 0; ch < 26; ++ch){
                res[i] = (char) (ch + 'a');

                int pivot = 0, last = 0;
                for(int j=0; j<sb.length(); ++j){
                    if(res[pivot] == sb.charAt(j)){
                        pivot++;
                        last = j;
                        if(pivot > i)break;
                    }
                }

                //this means that ch is not a valid solution in this step
                if(pivot <= i)continue;

                for(int k=0; k<26; ++k){
                    want[k] = count[k];
                    have[k] = 0;
                }

                //remove the characters found so far
                for(int j=0; j<=i; ++j){
                    want[res[j]-'a']--;
                }

                //see if sb[last+1 .. end] has the wanted characters
                for(int j=last+1; j<sb.length(); ++j){
                    have[sb.charAt(j)-'a']++;
                }

                boolean ok = true;
                for(int k=0; k<26 && ok; ++k){
                    if(want[k] < 0 || want[k] > have[k])ok = false;
                }

                //if ch was ok, greedily I've found a partial solution move to next
                if(ok)break;
            }
        }

        System.out.println(res);
    }
}
