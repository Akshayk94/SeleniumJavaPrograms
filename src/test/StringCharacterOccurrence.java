package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*Count the occurrence of each character in string*/
public class StringCharacterOccurrence {
    public static void main(String[] args) {
        String msg="Java Developer";
        char[] data=msg.toCharArray();
        Map<Character,Integer> info=new HashMap<>();
        for (Character c:data){
            info.put(c,info.getOrDefault(c,0)+1);
        }

        Set<Map.Entry<Character,Integer>> entry=info.entrySet();
        for (Map.Entry<Character,Integer> e:entry){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
