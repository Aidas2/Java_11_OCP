package classdesign;

class Bread {

    private String eat(String piece) {
        return "Consume " + piece;
    }
}
class Pizza extends Bread {

    public String eat(String slice) {
        return "Enjoy " + slice;
    }
}
//class Test12345 {
//
//    public static void main(String[] args) {
//        Bread b1 = new Bread();
//        b1.eat("bread.");
//        Bread b2 = new Pizza();
//        b2.eat("Quattro Stagioni.");
//    }
//}

public class PQ_34 {

}
