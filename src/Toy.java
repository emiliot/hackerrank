import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by emiliot on 4/11/16.
 */

class test{
    private int a;

    public test(int a){ this.a = a; }

    public int getA() {
        return a;
    }

    public void setA(int x){
        this.a  = x;
    }
}

public class Toy {
    public static void check(test x){
        x.setA(100);
        System.out.println(x.getA());
    }

    public static void main(String args[]){
        test list[] = new test[20];
        for(int i=19; i>=0; --i){
            list[20 - i - 1] = new test(i);
        }

        Arrays.sort(list, Comparator.comparing(test::getA));


        for(int i=0; i<20; ++i){
            System.out.print(list[i].getA() + " ");
        }

        List<test> list2 = new LinkedList<>();
        for(int i=19; i>=0; --i){
            list2.add(new test(i));
        }
        System.out.println("");
        Collections.sort(list2, Comparator.comparing(test::getA));

        for (test next:
             list2) {
            System.out.print(next.getA() + " ");
        }

        test a = new test(99);
        check(a);
        System.out.println(a.getA());
    }
}
