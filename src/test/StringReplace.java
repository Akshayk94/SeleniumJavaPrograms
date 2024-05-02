package test;

public class StringReplace {
    public static void main(String[] args) {
        String s="Jony Jony Yes Pappa";
        StringBuilder sb=new StringBuilder(s);

        /*Approach-1*/
        //String updated=s.replace('J','t').replace('P','n');
        //System.out.println(updated);

        /*Approach-2*/
        char[] data=s.toCharArray();
        for (int ch=0;ch< data.length;ch++){
            if (data[ch]=='J'){
                sb.setCharAt(ch,'t');
            } else if (data[ch]=='P') {
                sb.setCharAt(ch,'n');
            }
        }
        System.out.println(sb);
    }
}
