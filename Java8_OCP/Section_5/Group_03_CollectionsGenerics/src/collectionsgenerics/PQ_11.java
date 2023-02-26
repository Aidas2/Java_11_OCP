package collectionsgenerics;

import java.util.*;
import java.util.stream.*;

class Dog {

    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", breed=" + breed + '}';
    }
    
}

public class PQ_11 {

    public static void main(String[] args) {
        List<Dog> kennels = Arrays.asList(
                new Dog("Oliver", "Collie"),
                new Dog("Sam", "Beagle"),
                new Dog("Jack", "Beagle"));
        kennels.stream()
                // line n1

//                .sorted(Comparator.comparing(Dog::getBreed).reversed().thenComparing(Dog::getName))
//                .sorted(Comparator.comparing(Dog::getBreed).thenComparing(Dog::getName))
//                .map(Dog::getBreed).sorted(Comparator.reverseOrder())
//                .map(Dog::getBreed).sorted(Comparator.reverseOrder().map(Dog::getName).reversed())

                .collect(Collectors.toList())
                .forEach(System.out::println);
        
    }

}
