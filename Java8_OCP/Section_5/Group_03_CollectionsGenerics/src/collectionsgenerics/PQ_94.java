package collectionsgenerics;

interface Printable<Integer> {

    public default void printOnDemand(Integer copies) {
        System.out.println("Printing on demand.");
    }

    public void offsetPrinting(Integer copies);
}

public class PQ_94 {

    public static void main(String[] args) {
        
       
//        Printable<Integer> publisher = x -> System.out.println("Printing " + x + " copies.");
//        publisher.offsetPrinting(100000);
//        publisher.printOnDemand(2);
        
//        Printable<Integer> publisher = x -> x + 10;
//        publisher.offsetPrinting(100000);
//        publisher.printOnDemand(2);

//        Printable publisher = x -> System.out.println(x);
//        publisher.offsetPrinting(100000);
//        Printable.printOnDemand(2);

    }
}
