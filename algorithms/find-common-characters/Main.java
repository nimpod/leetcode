/*  Initial brute force solution:
        Runtime = 5ms, faster than 69.46%
        Memory = 38.7MB, less than 69.79%
*/


class Solution {
    public List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        // for each letter in the alphabet
        for (int i = 0; i < alphabet.length; i++) {
            int min = Integer.MAX_VALUE;
            
            // for each word...
            for (String word : A) {
                int wordCount = 0;
                
                // for each character in the word...
                for (char c :  word.toCharArray()) {
                    if (c == alphabet[i]) {
                        wordCount++;
                    }
                }
                min = Math.min(min, wordCount);
            }
            
            for (int j = 0; j < min; j++) {
                result.add(""+ alphabet[i]);
            }
        }
        
        return result;
    }
}

