import java.util.Scanner;

/**
 * Created by emiliot on 4/12/16.
 */
public class CaesarsCipher {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        int k = sc.nextInt();
        StringBuffer res = new StringBuffer();

        for(int i=0; i<n; ++i){
            char next = input.charAt(i);
            if(Character.isLetter(next)){
                if(Character.isUpperCase(next)){
                    next = (char) ((((next - 'A') + k) % 26) + 'A');
                }else{
                    next = (char) ((((next - 'a') + k) % 26) + 'a');
                }
            }
            res.append(next);
        }
        System.out.println(res);
    }
}
