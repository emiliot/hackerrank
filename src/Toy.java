/**
 * Created by emiliot on 4/11/16.
 */
class obj{
    public String bar;
    public obj(String bar){
        this.bar = bar;
    }
}

class test{
    private final obj foo = new obj("Hello");

    public test(){
        foo.bar = "World";
    }

    public String getBar(){
        return foo.bar;
    }
}

public class Toy {
    public static void main(String args[]){
        test t = new test();
        System.out.println(t.getBar());
    }
}
