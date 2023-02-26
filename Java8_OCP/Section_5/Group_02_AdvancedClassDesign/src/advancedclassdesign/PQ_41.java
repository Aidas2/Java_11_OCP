package advancedclassdesign;

abstract class Comsat {

    Comsat() {
        System.out.println("Communication Satellite");
    }

    protected void transmit() {
        System.out.println("Communication Satellite");
    }

} 

class Constellation extends Comsat {

    int num;

    Constellation(int num) {
        /* insert code here */
        this.num = num;
    }

    public void transmit() {
        System.out.println("Constellation of comsats");
    }

} 

//class Galileo extends Constellation {
//
//    int height, incl;
//
//    Galileo(int x, int y) {
//        /* insert code here */
//        height = x;
//        incl = y;
//    }
//
//    void transmit() {
//        System.out.println("Galileo");
//    }
//
//}

public class PQ_41 {

}
