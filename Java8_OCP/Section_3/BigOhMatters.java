package morning;

import java.util.*;

public class BigOhMatters {
    
    static int commonElems(List<Integer> list1,List<Integer> list2){
        int count = 0;
        
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) count++;
            }
        }
        
        return count;
    }

    static int commonElemsFast(List list1,List list2){
        int count = 0;
        Map<Object, Integer> map = new HashMap<>();
        
        for( Object e  : list1) map.put(e, map.getOrDefault(e, 0) + 1);
        for( Object e  : list2) count += map.getOrDefault(e, 0);
        
        
        return count;
    }


    
    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        
        Random rand = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list1.add(rand.nextInt(1000));
            list2.add(rand.nextInt(1000));
        }
        
        System.out.println(commonElemsFast(list1, list2));
        
        long stop = System.currentTimeMillis();
        System.out.println("Took " + (stop-start)/1000.0 + " sec");
    }
}
