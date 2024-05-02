package test;

public class NumberPalindrome {
    public static void main(String[] args) {
        int no=353;
        int temp=no;
        int reverseNo=0;
        while (no!=0){
            int remainder=no%10;
            reverseNo=reverseNo*10+remainder;
            no/=10;
        }
        System.out.println("GIVEN NO IS "+((temp==reverseNo)?"Palindrome":"Not Palindrome"));
    }
}
