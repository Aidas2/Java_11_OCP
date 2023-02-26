package morning;

//class MyException<T> extends Exception{}


class MyCall<T>{
    T t;
    
//    @Override
//    public boolean equals(T o){
//        return false;
//    }
    
    
    
    
//    {
//        new T();
//    }

}

interface Inter<T>{
    void run(T t);
}



public class GenLimDemo {
    static Object getObj(){
        return null;
    }
    
    public static void main(String[] args) {
        Object obj = getObj();
        
        if ( obj instanceof MyCall   )
            System.out.println("!!!!!!!!!!");
        
//        MyCall<String>[] arr = {};
        
        MyCall<int[]> mci = null;
        
        
        Inter<String> inter = new Inter<String>(){
            @Override
            public void run(String str){
                System.out.println(str);
            }
        };
        
        
        
        
    }
}
