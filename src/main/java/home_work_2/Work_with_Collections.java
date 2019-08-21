package home_work_2;

import java.util.*;

public class Work_with_Collections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<Double, Integer> map = new HashMap<>();

        int resultSum = 0;

        for(int i = 0; i<100; i++){
//            System.out.println((int)(Math.random() * 10)+1);
            list.add((int)(Math.random() * 10)+1);
            set.add((int)(Math.random() * 10)+1);
            map.put(Math.random(),(int)(Math.random() * 10)+1);
        }
        System.out.println("List size is " + list.size());
        System.out.println("Set size is " + set.size());
        System.out.println("Map size is " + map.size());

        System.out.println("\nList");
        for(Integer i:list){
            resultSum += i;
            System.out.print(i+", ");
        }

        System.out.println("\n\nset");
        for(Integer i:set){
            resultSum += i;
            System.out.print(i+", ");
        }

        System.out.println("\n\nMap");
        for (Map.Entry<Double,Integer> m:map.entrySet()){
            resultSum += m.getValue();
            System.out.println("Key: " + m.getKey() + " Value: " + m.getValue());
        }

        System.out.println("\n Sum of all elements of all collections = " + resultSum);
    }
}
