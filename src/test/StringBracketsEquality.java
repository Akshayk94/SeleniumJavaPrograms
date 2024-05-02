package test;

import java.util.Arrays;
import java.util.List;

public class StringBracketsEquality {
    public static void main(String[] args) {
        String str="[{()}]";
        boolean status=isValid(str);
        System.out.println((status)?"STRING IS VALID":"STRING IS INVALID");
    }

    private static boolean isValid(String str) {
        char[] data=str.toCharArray();
        int count=0;
        List<Character> openBrackets= Arrays.asList('[','{','(');
        List<Character> closeBrackets= Arrays.asList(']','}',')');
        for (char datum : data) {
            if (openBrackets.contains(datum)) {
                count++;
            } else if (closeBrackets.contains(datum)) {
                count--;
            }
        }
        return count == 0;
    }
}
