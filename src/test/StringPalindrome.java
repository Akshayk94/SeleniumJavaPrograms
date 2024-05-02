package test;

public class StringPalindrome {
    public static void main(String[] args) {
        String data="Tat";
        String reverseString="";
        for (int a=data.toCharArray().length-1;a>=0;a--){
            reverseString+=data.charAt(a);
        }
        if (data.equalsIgnoreCase(reverseString)){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is not Palindrome");
        }
    }
}
