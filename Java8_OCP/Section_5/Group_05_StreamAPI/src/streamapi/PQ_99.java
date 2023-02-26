package streamapi;

import java.util.*;

class Car {

    private List<Wheel> wheels;

    public Car() {
        wheels = Arrays.asList(new Wheel(), new Wheel(), new Wheel(), new Wheel());
    }

    public List<Wheel> getWheels() {
        return wheels;
    }
}

class Wheel {

    private int airPressure;

    public Wheel() {
        airPressure = (int) (Math.random() * 100); // sets random values
    }                                              // from 0 to 99 incl.
    
    public int getAirPressure() { return airPressure; }

}

class Test{ 
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(new Car(), new Car(), new Car());
//        System.out.println(cars.stream()
//                               .map(Car::getWheels)             // line n1
//                               .flatMap(Wheel::stream)          // line n2
//                               .mapToInt(Wheel::getAirPressure) // line n3
//                               .max()                           // line n4
//                               .isPresent()                     // line n5
//        );
    }
}


    public class PQ_99 {

    }
