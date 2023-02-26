package collectionsgenerics;

import java.util.*;

class CommCodes {

    public static int checkLength(String str1, String str2) {
        return str2.length() - str1.length();
    }
}

class Test {

    public static void main(String[] args) {
        String[] strArr = new String[]{"Sitrep", "Over", "Out", "Roger"};
        
        // line n1
        Arrays.sort(strArr, CommCodes :: checkLength);
//        Arrays.sort(strArr, (new CommCodes()) :: checkLength);
//        Arrays.sort(strArr, (CommCodes :: new).checkLength);
//        Arrays.sort(strArr, CommCodes :: new :: checkLength);
        
        for (String s : strArr) {
            System.out.print(s + " ");
        }
    }
}

public class PQ_65 {

}
