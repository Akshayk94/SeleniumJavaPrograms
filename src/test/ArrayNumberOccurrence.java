package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayNumberOccurrence {
    public static void main(String[] args) {
        int[] numbers={10,20,10,60,20,10,70};
        Map<Integer,Integer> data=new HashMap<>();
        for (Integer i:numbers){
            data.put(i,data.getOrDefault(i,0)+1);
        }
        Set<Map.Entry<Integer,Integer>> entries=data.entrySet();
        for (Map.Entry<Integer,Integer> e:entries){
            if (e.getValue()>1){
                System.out.println(e.getKey()+":"+e.getValue());
            }else {
                System.out.println(e.getKey()+":-1");
            }
        }
    }
}
