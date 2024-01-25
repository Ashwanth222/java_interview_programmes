package Strings;

public class PrintNonRepeatedFirstLetter {
    public static void main(String[] args){
        String s = "shiva krishna";
        for(int i = 0; i<s.length();i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                System.out.println("this is the first non repeated character : " + s.charAt(i));
                break;
            }
        }
    }
}
