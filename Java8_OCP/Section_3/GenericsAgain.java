
import java.util.*;

class Pops {

    static {
        System.out.println("static initer - Pops");
    }

    {
        System.out.println("non-static initer - Pops");
    }

    Pops() {
        System.out.println("ctor - Pops");
    }

    public String toString() {
        return "Pops";
    }
}

class Father extends Pops {

    static {
        System.out.println("static initer - Father");
    }

    {
        System.out.println("non-static initer - Father");
    }

    Father() {
        System.out.println("ctor - Father");
    }

    public String toString() {
        return "Father";
    }
}

class Son extends Father {

    static {
        System.out.println("static initer - Son");
    }

    {
        System.out.println("non-static initer - Son");
    }

    Son() {
        System.out.println("ctor - Son");
    }

    public String toString() {
        return "Son";
    }
}

public class GenericsAgain {

    static List<? extends Father> getThem(){
        return Arrays.asList(new Son(), new Son(), new Son());
    }
    
    static void run(List<? extends Father> list){
//        list.add(new Son());
    }
    
    public static void main(String[] args) {

        List<? extends Father> list = getThem();
        
        run(list);
        
        
        
        
    }
}
