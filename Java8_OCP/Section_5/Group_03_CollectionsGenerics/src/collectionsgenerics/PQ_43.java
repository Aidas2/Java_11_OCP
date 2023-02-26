package collectionsgenerics;

import java.util.*;
import java.util.stream.*;

class Band {

    String name, style, country;

    public Band(String name, String style, String country) {
        this.style = style;
        this.name = name;
        this.country = country;
    }

    public String getStyle() {
        return style;
    }

    public String toString() {
        return style + " : " + name + " : " + country;
    }
}

public class PQ_43 {

    public static void main(String[] args) {
        List<Band> bands = Arrays.asList(
                new Band("Yes", "Prog Rock", "UK"),
                new Band("Boney M", "Euro Disco", "Germany"),
                new Band("ELP", "Prog Rock", "UK"));
        bands.stream()
             .collect(Collectors.groupingBy(Band::getStyle))
             .forEach((x, y) -> System.out.println(x));
    }
}
