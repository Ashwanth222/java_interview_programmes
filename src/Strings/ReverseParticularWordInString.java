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
    }
}
