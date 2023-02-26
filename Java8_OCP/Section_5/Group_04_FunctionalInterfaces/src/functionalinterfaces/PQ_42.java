package functionalinterfaces;

import java.util.function.*;

class Browser {

    public void surf() {
        System.out.print("See me surf!");
    }
}

class Tor extends Browser {

    public void surf() {
        System.out.print("Stealth mode engaged.");
    }
}

class Tails {

    public static void main(String[] args) {
//        surf(() -> new Browser());
//        surf(Tor::new);
    }

    /* line n1 */

//    static void surf(Consumer<Browser> browser) {
//        browser::surf();
//    }
//
//    static void surf(Consumer<? extends Browser> browser) {
//        browser.accept().surf();
//    }
//    
//    static void surf(Supplier<Browser> browser) {
//        browser.get().surf();
//    }
//    
//    static void surf(Supplier<? extends Browser> browser) {
//        browser::surf();
//    }

}

public class PQ_42 {
}
