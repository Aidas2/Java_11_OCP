package morning;

import java.util.*;

abstract class Student {

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

class MasterStudent extends Student{
    
    String subj;

    public MasterStudent(String name, int age, double gpa, String subj) {
        super(name, age, gpa);
        this.subj = subj;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.subj);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MasterStudent other = (MasterStudent) obj;
        if (!Objects.equals(this.subj, other.subj)) {
            return false;
        }
        return true;
    }
    
    
    
}

public class TamaraDemo {
    public static void main(String[] args) {
        Student kolya = new MasterStudent("Kolya", 12, 3.5, "MCIT");
        Student masha = new MasterStudent("Masha", 14, 4.5, "MCIT");

        Set<Student> set = new HashSet<>();
        set.add(kolya);
        set.add(masha);
        
        System.out.println(set.size());
        
        
        
    }
}
