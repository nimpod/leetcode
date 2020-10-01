
/**
 * Initial Brute Force Solution:
 *      Runtime = 365ms, faster than 5.18%
 *      Memory = 39.9MB, less than 56.52%
 */

import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int romanToInt(String s) {
        // setting things up
        HashMap<Character, Integer> numerals = new HashMap<Character, Integer>();
        
        char[] symbols = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        Integer[] values = { 1, 5, 10, 50, 100, 500, 1000 };
                        
        // put symbols and values into a HashMap
        for (int i = 0; i < values.length; i++) {
            numerals.put(symbols[i], values[i]);
        }
                
        char current = 'a';
        char next = 'a';
        int total = 0;
        int i = 0;
        
        while (i < s.length()) {
            // every element, apart from the Nth element, the last one.
            if (i < s.length()-1) {
                current = s.charAt(i);
                next = s.charAt(i+1);
                                
                // special case 1: I comes before V or X
                if (current == 'I' && (next == 'V' || next == 'X')) {
                    total += numerals.get(next) - numerals.get('I');
                    i+=2;
                }
                
                // special case 2: X comes before L or C
                else if (current == 'X' && (next == 'L' || next == 'C')) {
                    total += numerals.get(next) - numerals.get('X');
                    i+=2;
                }
                
                // special case 3: C comes before D or M
                else if (current == 'C' && (next == 'D' || next == 'M')) {
                    total += numerals.get(next) - numerals.get('C');
                    i+=2;
                }
                
                // any other case:
                else {
                    total += numerals.get(current);
                    i+=1;
                }
                
                System.out.printf("total=%d, i=%d, current=%c, next=%c \n", total, i, current, next);
            } 
            
            // the Nth element, the last one
            else {
                current = s.charAt(i);
                total += numerals.get(current);
                i+=1;
            }
        }
        
        return total;
    }
}