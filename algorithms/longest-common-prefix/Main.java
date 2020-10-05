/*  Initial brute force solution:
        Runtime = 14ms, faster than 6.76%
        Memory = 39.1MB, less than 25.15%

    Time complexity = O(N^2)
*/

import java.util.Arrays;
import java.lang.*; 

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String previousStr = "";
        String currentStr = "";
        
        int min = 0;
        int tempMin = 0; 
        
        // get length of first string
        if (strs.length > 0) {
            min = strs[0].length();
        }
        
        System.out.println("Min = " + min);

        // start loop at second string
        for (int i = 1; i < strs.length; i++) {
            tempMin = 0;
    
            currentStr = strs[i];
            previousStr = strs[i-1];

            int lengthOfSmallestStr = Math.min(currentStr.length(), previousStr.length());

            for (int j = 0; j < lengthOfSmallestStr; j++) {                
                char c1 = currentStr.charAt(j);
                char c2 = previousStr.charAt(j);

                // characters matched
                if (c1 == c2) {
                    tempMin++;
                }
                
                // characters did not match
                else {
                    if (tempMin < min) {
                        min = tempMin;
                    }
                    break;
                }
            }
            if (tempMin < min) {
                min = tempMin;
            }
        }

        String longestStr = getLongestString(strs);
        String prefix = longestStr.substring(0, min);

        return prefix;
    }
    
    public static String getLongestString(String[] array) {
        int maxLength = 0;
        String longestString = "";
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }
}