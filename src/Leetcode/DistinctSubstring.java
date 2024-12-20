package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class DistinctSubstring {
    public static void main(String[] args){
        String str = "aaaabbcdd";
        Set<String> result = new HashSet<String>();

        // List All Substrings
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {

                // Add each substring in Set
                result.add(str.substring(i, j));
            }
        }

        // Return size of the HashSet
         System.out.println(result.size());
    }
}
