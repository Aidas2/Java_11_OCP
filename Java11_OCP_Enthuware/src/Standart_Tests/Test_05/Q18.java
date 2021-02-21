package Standart_Tests.Test_05;

/*
What will the following class print ?
You had to select 1 option
        99 , 11
        1 , 11
        1 and an unknown value.
        99 and an unknown value.
        It will throw an exception at Run time.
*/

class Q18{
    public static void main(String[] args){
        int[][] a = { { 00, 01 }, { 10, 11 } };
        int i = 99;
        try {
            a[val()][i = 1]++;
        } catch (Exception e) {
            System.out.println( i+", "+a[1][1]);
        }
    }
    static int val() throws Exception {
        throw new Exception("unimplemented");
    }
}
