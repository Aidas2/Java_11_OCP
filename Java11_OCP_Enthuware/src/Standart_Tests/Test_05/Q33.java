package Standart_Tests.Test_05;

import java.util.HashMap;

public class Q33 {
    public static void main(String[] args) {

//        Given:
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "a"); hm.put(2, "b"); hm.put(3, "c");

//        Which of the following statements will print the keys as well as values contained in the map?
        hm.forEach((key, entry)->System.out.println(entry));
//        hm.forEach(System.out.println("%d %s"))
        hm.forEach((key, value)->System.out.printf("%d %s ", key, value));
//        hm.forEach(System.out::println);
//        hm.forEach(entry->System.out.println(entry));

    }

}
