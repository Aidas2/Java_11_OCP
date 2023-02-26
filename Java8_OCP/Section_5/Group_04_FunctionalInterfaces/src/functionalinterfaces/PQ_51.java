package functionalinterfaces;

import java.util.function.*;

public class PQ_51 {

    public static void main(String[] args) {
        String str = "Say what?!";
        ToIntFunction<String> indx = str::indexOf;  //line n1
        int a = indx.applyAsInt("Say");             //line n2
        System.out.println(a);        
    }
}
