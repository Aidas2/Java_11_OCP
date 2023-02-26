package streamapi;

import java.util.*;
import java.util.function.*;

public class PQ_76 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Chuck");
        Function<String, String> func = x -> "Hi ".concat(x);
        names.stream()
             .map(func)
             .peek(System.out::println);
    }
}
