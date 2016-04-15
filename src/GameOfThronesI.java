import java.util.Scanner;

/**
 * Created by emiliot on 4/15/16.
 */
public class GameOfThronesI {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int mark [] = new int[26];
        for(int i=0; i<input.length(); i++){
            mark[input.charAt(i) - 'a']++;
        }
        int odd = input.length() % 2;
        boolean res = true;
        for(int i=0; i<26; ++i){
            if(mark[i] % 2 != 0){
                if(odd == 1){
                    odd = 0;
                }else
                    res = false;
            }
        }
        System.out.println(res ? "YES" : "NO");
    }
}
