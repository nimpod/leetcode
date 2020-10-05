/*  Initial brute force solution:
        Runtime = 2ms, faster than 36.61%
        Memory = 34.3MB, less than 29.79%
*/

class Solution {
    public boolean isValid(String s) {
        
        // string contains an odd number of elements, so there must be at least 1 pair of parentheses that don't match
        if(s.length()%2 != 0)
            return false;

        Stack stack = new Stack();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        // for each chararacter in the string
        for (char ch : s.toCharArray()) {
            
            // is there an open bracket? if so, push it onto the stack
            if (map.containsKey(ch)) {
                stack.push(ch);
            } 
            
            // is there a closing bracket? If the stack is still empty, or the top of the stack doesn't match, 
            else if (map.containsValue(ch)) {
                if (stack.isEmpty() || map.get(stack.pop()) != ch) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}