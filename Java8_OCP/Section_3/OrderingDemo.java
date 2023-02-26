package afternoon;

import java.util.*;
import java.util.stream.Collectors;


class Dog implements Comparable<Dog>{
    String breed;
    int age;

    @Override
    public int compareTo(Dog o) {
        return this.age - o.age;
    }

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" + "breed=" + breed + ", age=" + age + '}';
    }
    
}



class Student {

    String name;
    int age;
    double gpa;
    
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    @Override
    public String toString() {
        return name + ", " + age + ", " + gpa;
    }

    
    
    
}


public class OrderingDemo {
    
    static List<Student> sortGroupByName(List<Student> list, Comparator<Student> comp){
        return sortThem(list, comp);
    }
    static List<Student> sortGroupByAge(List<Student> list, Comparator<Student> comp){
        return sortThem(list, comp);
    }
    static List<Student> sortThem (List<Student> list, Comparator<Student> comp){
        return list.stream().sorted(comp).collect(Collectors.toList());
    }
    
    public static void main(String[] args) {
        
        Student s1 = new Student("Kolya", 12, 3.5);
        Student s2 = new Student("Masha", 14, 5);
        Student s3 = new Student("Petya", 128, 0.3);
        Student s4 = new Student("Vitya", 14, 4.5);
        Student s5 = new Student("Sasha", 12, 3.5);
        Student s6 = new Student("Pasha", 15, 4.5);
        Student s7 = new Student("Masha", 18, 2.5);
        Student s8 = new Student("Sasha", 19, 7.5);
        Student s9 = new Student("Mila", 23, 3.5);
        Student s10 = new Student("Lena", 32, -3.5);
        Student s11 = new Student("Kolya", 42, 4.5);
        Student s12 = new Student("Kolya", 32, 4.9);
        
        List<Student> students = new ArrayList<>();
        students.add(s11);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s12);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);
        
//        Collections.sort(students);
        
//        Set<Student> set = new TreeSet<>(students);
        

//        Set<Dog> set = new TreeSet<>();
//        set.add(new Dog("Husky", 12));
//        set.add(new Dog("Bulldog", 1));
//
//        System.out.println(set);

        Comparator<Student> compName = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        };

        Comparator<Student> compAge = (st1, st2) ->
//                Integer.valueOf(st1.age).compareTo(st2.age)
                st1.age - st2.age;

        Comparator<Student> compGpa = (st1, st2) ->
                Double.valueOf(st1.gpa).compareTo(st2.gpa) ;

//        students.stream()
////                .sorted(compName)
//                .sorted(compGpa)
//                .forEach( s -> System.out.println(s));

        sortGroupByName(students, compName).forEach(System.out::println);
        System.out.println("*******************************");
        sortGroupByAge(students, compAge).forEach(System.out::println);



    }
}
