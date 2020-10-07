/*  Initial brute force solution:
        Runtime = 65ms, faster than 16.46%
        Memory = 81.12MB, less than 39.4%

    Time complexity = O(N^2)
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // base case: string is empty
        if (s.length() == 0) {
            return 0;
        }
        
        // setup
        HashSet<Character> uniques = new HashSet<Character>();
        int i = 0;
        int j = 0;
        int currentSubstring = 0;
        int longestSubstring = 0;        
        
        // for each character in the string...
        while (j < s.length()) {
            // on first iteration...
            if (uniques.size() == 0) {
                i++;
                j = i-1;
            }

            // try and add the current character to a hashset
            uniques.add(s.charAt(j++));
            
            // verify we checked another character
            currentSubstring++;
            
            // no duplicates
            if (uniques.size() == currentSubstring && j == s.length()) {     
                longestSubstring = Math.max(currentSubstring, longestSubstring);
                break;
            }
            
            // there was a duplicate
            if (uniques.size() < currentSubstring) {
                longestSubstring = Math.max(currentSubstring-1, longestSubstring);
                
                // reset currentSubstring and hashset because we are about to iterate onto the next substring
                currentSubstring = 0;
                uniques.clear();
            }
        }
        
        return longestSubstring;
    }
}