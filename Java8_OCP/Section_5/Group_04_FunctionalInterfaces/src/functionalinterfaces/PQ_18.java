package functionalinterfaces;

import java.util.*;
import java.util.function.*;

public class PQ_18 {
    public static void main(String[] args) {
        List<String> ad = Arrays.asList("See", "Java", "run.", "Run", "Java", "run.");
        Predicate<String> test = x -> {
            int i = 0;
            boolean hit = x.contains("Java");
            System.out.print(i++ + " - ");
            return hit;
        };
        ad.stream()
          .filter(test)
          .findFirst()
          .ifPresent(System.out::print);
    }
}
