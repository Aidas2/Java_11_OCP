package morning;

import java.util.*;

public class OrderedCollDemo {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<String>();
        cities.add("Vladik");
        cities.add("Ryazan");
        cities.add("Moscow");
        System.out.println("LHS:\t" + cities);
        
        cities = new TreeSet<>(cities);
        System.out.println("TreeSet:" + cities);
        
        cities = new HashSet<>(cities);
        System.out.println("HashSet:" + cities);
        
    }
}
