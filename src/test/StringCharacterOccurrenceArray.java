package test;

public class StringCharacterOccurrenceArray {
    public static void main(String[] args) {
        String str="Java";
        int[] frequency=new int[256];
        char[] data=str.toCharArray();
        for (Character ch:data){
            frequency[ch]++;
        }
        for (int a=0;a< frequency.length;a++){
            if (frequency[a]>1){
                System.out.println((char)a+":"+frequency[a]);
            }
        }
    }
}
