package test;

public class NamePattern {
    public static void main(String[] args) {
        String name="AKSHAY";
        char[] data=name.toCharArray();
        int count=0;
        for (int a=1;a<= data.length;a++){
            for (int b=0;b<=count;b++){
                System.out.print(data[b]+" ");
            }
            System.out.println();
            count++;
        }
    }
}
