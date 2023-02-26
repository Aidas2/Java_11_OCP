package afternoon;

import java.util.*;

class SubatomicPartcle implements Comparable<SubatomicPartcle>{
    private final int charge;

    public SubatomicPartcle(int charge) {
        this.charge = charge;
    }

    @Override
    public int compareTo(SubatomicPartcle other) {
        //  'naive' implementation; dangerous
//        return this.charge - other.charge;

        // fail-safe implementation; recommended
//        return Integer.valueOf(this.charge).compareTo(other.charge);

        // 'talking' implementation; alerts user by throwing ArithmeticException
        return Math.subtractExact(this.charge, other.charge);
    }

    @Override
    public String toString() {
        return "charge = " + charge;
    }
}

class Cern {

    public static void main(String[] args) {

        SubatomicPartcle p1 = new SubatomicPartcle(1000);
        SubatomicPartcle p2 = new SubatomicPartcle(Integer.MIN_VALUE);
        SubatomicPartcle p3 = new SubatomicPartcle(-17000);
        SubatomicPartcle p4 = new SubatomicPartcle(Integer.MAX_VALUE);
        SubatomicPartcle p5 = new SubatomicPartcle(41000);
        
        List<SubatomicPartcle> particles = Arrays.asList(p1,p2,p3,p4,p5);

        Collections.sort(particles);

        for( SubatomicPartcle p : particles ){
            System.out.println(p);
        }
        
    }
}
