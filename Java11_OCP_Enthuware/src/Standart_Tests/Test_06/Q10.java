package Standart_Tests.Test_06;
import java.util.*;

public class Q10 {

    static class Student{
        int marks;
    }

    public static class TestClass {
//        static var getHighest(var students){
        static int getHighest(ArrayList<Student> students){
            int highest = 0;
            for(var student : students){
                if(highest <student.marks) highest  = student.marks;
            }
            return highest;
        }

        public static void main(String[] args)  {

            var student  = new Student();

            var allStudents = new ArrayList<Student>();

            allStudents.add(student);

            var h = getHighest(allStudents);

            System.out.println(h);
        }

    }

//    Identify correct statements about the above code.
}
