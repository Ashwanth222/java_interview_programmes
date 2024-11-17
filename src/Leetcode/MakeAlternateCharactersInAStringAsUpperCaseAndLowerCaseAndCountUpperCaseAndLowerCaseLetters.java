package Leetcode;

public class MakeAlternateCharactersInAStringAsUpperCaseAndLowerCaseAndCountUpperCaseAndLowerCaseLetters {
    public static void main(String[] args){
        String s = "aabcdefghijjkll";
        int n = s.length();
        char ch;
        int i;
        for(i = 0; i < n; i++) {
            if(i % 2 == 0) {
                ch = Character.toLowerCase(s.charAt(i));
                s = s.replace(s.charAt(i), ch);
            } else {
                ch = Character.toUpperCase(s.charAt(i));
                s = s.replace(s.charAt(i), ch);
            }
        }
        System.out.println(s);
        int upperCase = 0;
        int lowerCase = 0;
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for (int k = 0; k < s.length(); k++) {
            /**
             * The methods isUpperCase(char ch) and isLowerCase(char ch) of the Character
             * class are static so we use the Class.method() format; the charAt(int index)
             * method of the String class is an instance method, so the instance, which,
             * in this case, is the variable `input`, needs to be used to call the method.
             **/
            // Check for uppercase letters.
            if (Character.isUpperCase(s.charAt(k))) {
                upperCase++;
                sb1.append(s.charAt(k));
            }
            // Check for lowercase letters.
            if (Character.isLowerCase(s.charAt(k))) {
                lowerCase++;
                sb2.append(s.charAt(k));
            }
        }

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.printf("There are %d uppercase letters and %d lowercase letters.",upperCase,lowerCase);
    }
}
