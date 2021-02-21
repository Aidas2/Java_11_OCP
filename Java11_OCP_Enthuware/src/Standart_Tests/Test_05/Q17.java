package Standart_Tests.Test_05;

/*
Consider the following code...
What can replace XXXX?
You had to select 3 options
        MyException
        Exception
        No throws clause is necessary
        Throwable
        RuntimeException
*/

class MyException extends Exception {
}

public class Q17 {
    public void myMethod() throws MyException {
        throw new MyException();
    }
}
