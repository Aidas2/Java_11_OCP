package Standart_Tests.Test_06;

public class Q02 {

//    Given:

    enum Coffee {
        ESPRESSO("Very Strong"), MOCHA("Bold"), LATTE("Mild");
        public String strength;

        Coffee(String strength) {
            this.strength = strength;
        }

//        public String toString() {
//            return String.valueOf(Coffee.ESPRESSO);
//        }

        public String toString() {
            return String.valueOf(strength);
        }
    }


    public static void main(String[] args) {
        //    and the statement
        System.out.println(Coffee.ESPRESSO);

    }

//    What can be done so that the above statement will print Very Strong?

}
