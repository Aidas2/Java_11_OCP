package Java_819.Test_02;

import java.util.TreeSet;

public class Q58 {

    enum SIZE {
        TALL, JUMBO, GRANDE
    }

    public static void main(String[] args) {
        TreeSet<SIZE> hs = new TreeSet<SIZE>();
        hs.add(SIZE.TALL); hs.add(SIZE.JUMBO); hs.add(SIZE.GRANDE);
        hs.add(SIZE.TALL); hs.add(SIZE.TALL); hs.add(SIZE.JUMBO);
        for (SIZE s : hs) {
            System.out.println(s);
        }
    }

}
