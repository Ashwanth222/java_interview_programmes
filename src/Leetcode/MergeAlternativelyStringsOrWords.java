package Leetcode;

public class MergeAlternativelyStringsOrWords {
    public static void main(String[] args){
        String s1 = "Hi how are you";
        String s2 = "Hi how are you you you";
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while(i<s1.length() || i<s2.length()){
            if(i <s1.length()) {
                sb.append(s1.charAt(i) + " " );
            }
            if(i <s2.length()) {
                sb.append(s2.charAt(i) + " ");
            }
            i++;
        }
        System.out.println(sb);

        //alternate
        StringBuffer sb1 = new StringBuffer();
        int j = 0;
        String[] st = s1.split(" ");
        String[] ts = s2.split(" ");
        while(j<st.length || j<ts.length){
            if(j <st.length) {
                sb1.append(st[j] + " " );
            }
            if(j <ts.length) {
                sb1.append(ts[j]).append(" ");
            }
            j++;
        }
        System.out.println(sb1);
    }
}
