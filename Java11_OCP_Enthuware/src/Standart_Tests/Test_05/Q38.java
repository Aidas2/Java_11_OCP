package Standart_Tests.Test_05;

public class Q38 {
    public static void main(String[] args) {

//        What will be the result of attempting to compile and run the following program?

        var b = false;
        var i = 1;
        do{
            i++ ;
        } while (b = !b);
        System.out.println( i );

    }

}
