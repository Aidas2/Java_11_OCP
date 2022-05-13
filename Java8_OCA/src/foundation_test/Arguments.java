package foundation_test;

public class Arguments {
//    public static void main(String args[ ]){
//        if (args.length != 0)   System.out.println(args[args.length-1]);
//    }

//    public static void main(String args[ ]){
//        try {      System.out.println(args[args.length-1]);        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Pagavau");
//        }
//    }

//    public static void main(String args[ ]){
//        int i = args.length;
//        if (i != 0) System.out.println(args[i-1]);
//    }

//    public static void main(String args[ ]){
//        int i = args.length-1;
//        if (i > 0) System.out.println(args[i]);
//    }

//    public static void main(String args[ ]){
//        try { System.out.println(args[args.length-1]); }
//        catch (NullPointerException e) {
//            System.out.println("Pagavau bet ne tą");
//        }
//    }

    public static void main(String[] args){
        for (int i = 0; i < 10; i++) System.out.print(i + " ");  //1
        for (int i = 10; i > 0; i--) System.out.print(i + " ");  //2
        int i = 20;                  //3
        System.out.print(i + " ");   //4
    }

}
