package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*find duplicate characters in string*/
public class StringDuplicates {
    public static void main(String[] args) {
        String msg="Java";
        char[] data=msg.toCharArray();
        Map<Character,Integer> info=new HashMap<>();
        for (char datum : data) {
            info.put(datum, info.getOrDefault(datum, 0) + 1);
        }
        Set<Map.Entry<Character,Integer>> entry=info.entrySet();
        for (Map.Entry<Character,Integer> e:entry){
            if (e.getValue()>1){
                System.out.println(e.getKey()+"\t"+e.getValue());
            }
        }
    }
}
