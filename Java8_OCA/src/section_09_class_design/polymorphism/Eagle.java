package section_09_class_design.polymorphism;

/**
 * @author goran on 15/07/2017.
 */
public class Eagle extends Bird {

    public int fly(int height) {
        System.out.println("Eagle is flying at " + height + " meters");
        return height;
    }

//    @Override
//    public int eat(int amount) {
//
//        return amount;
//    }
}
