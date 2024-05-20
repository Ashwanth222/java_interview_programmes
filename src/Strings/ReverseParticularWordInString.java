package Strings;

public class ReverseParticularWordInString {
    public static void main(String[] args) {

//
//input = I got an appreciation this year
//
//output = I got an noitaicerppa this year

        String s1 = "I got an appreciation this year";
        System.out.println("input string  : "+ s1);
        StringBuffer sb = new StringBuffer(s1);
        String[] s2 = s1.split(" ");
        int l = s2.length;
        for (int i = 0; i<=l-1; i++){
            if(s2[i].equals("appreciation")){

                StringBuffer sb1 = new StringBuffer(s2[i]).reverse();
                System.out.print(  sb1 + " ");

            }
            else{
                System.out.print(s2[i] + " ");

            }
        }
        System.out.println();
        //alternate
        String s3 = "I got an appreciation this year";
        StringBuffer sb1 = new StringBuffer();
        String[] s4 = s1.split(" ");
        int l1 = s2.length;
        for (int i = 0; i<=l1-1; i++){
            if(s2[i].equals("appreciation")) {
                sb1.append(new StringBuffer(s2[i]).reverse() + " ");
            }else {
                sb1.append(new StringBuffer(s2[i]) + " ");
            }
        }
        System.out.println(sb1);
    }
}
