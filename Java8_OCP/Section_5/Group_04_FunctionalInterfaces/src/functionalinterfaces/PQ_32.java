package functionalinterfaces;

import java.util.*;
import java.util.function.*;

public class PQ_32 {

    public static void main(String[] args) {
        List<String> graces = Arrays.asList("faith", "hope", "love");
        Predicate<String> test = x -> {
            System.out.println("Still waiting...");
            return x.contains("love");
        };
        graces.stream()
              .filter(x -> x.length() >= 4)
              .allMatch(test);
    }
}
