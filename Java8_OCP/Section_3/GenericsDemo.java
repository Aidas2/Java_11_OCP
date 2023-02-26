package morning;
import java.util.*;

// T == type parameter

class UniBox<T extends Number>{
    T thing;
    
    public UniBox(T thing) {
        this.thing = thing;
    }
    
}

class Pops {

    static {
        System.out.println("static initer --- Pops");        
    }

    {
        System.out.println("instance initer --- Pops");        
    }

    Pops() {
        System.out.println("ctor --- Pops");        
    }
}

class Father extends Pops {

    static {
        System.out.println("static initer --- Father");        
    }

    {
        System.out.println("instance initer --- Father");        
    }

    Father() {
        System.out.println("ctor --- Father");        
    }
}

class Son extends Father {

    static {
        System.out.println("static initer --- Son");        
    }

    {
        System.out.println("instance initer --- Son");        
    }

    Son() {
        System.out.println("ctor --- Son");        
    }
}





public class GenericsDemo {
    public static void main(String[] args) {

////        List<? extends Number> nums = new ArrayList<>();
//        List<? extends Number> nums = Arrays.asList(1.0, 2, 3);
////        nums.add(10);
////        nums.add(100);
////        nums.add(110);
////        nums.add(-10);
////        nums.get(0);
//        System.out.println(nums.get(0).getClass().getName());

        List<? super Father> fam =
            Arrays.asList(new Son(), new Father(), new Pops());
//        fam.add(new Son());
//        fam.add(new Father());
        
        Son son = (Son)fam.get(0);
        System.out.println(fam.get(0).getClass().getName());















    }
}
