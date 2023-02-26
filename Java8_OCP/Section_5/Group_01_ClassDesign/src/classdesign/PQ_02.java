package classdesign;
import java.util.*;

class Plant {

    public String brew(String msg) {
        return msg;
    }
}

class Coffee extends Plant {

    public String brew(String msg) {
        return msg.replace('a', 'e');
    }
}

class Arabica extends Coffee {

    public String brew(String msg) {
        return msg.substring(2);
    }
}

public class PQ_02 {

    public static void main(String[] args) {
        List<Plant> cup = new ArrayList<Plant>();
        cup.add(new Plant());
        cup.add(new Coffee());
        cup.add(new Arabica());
        for (Plant item : cup) {
            System.out.println(item.brew("Java"));
        }
    }

}
