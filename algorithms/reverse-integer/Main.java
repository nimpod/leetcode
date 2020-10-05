/*  Initial brute force solution:
        Runtime = 11ms, faster than 6.35%
        Memory = 37.6MB, less than 22.84%

    Time complexity = O(N)
*/

class Solution {
    public int reverse(int x) {
        // check for integer overflow
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }
        
        // check if the number is negative or positive
        boolean isNegative = (x < 0);
        
        // take the positive value of x, this removes the '-' symbol
        int xAbs = Math.abs(x);
        
        // convert number to string
        String strX = String.valueOf(xAbs);
        
        // reverse string
        int i, len = strX.length();
        String reversed = new String();        
        for (i = (len-1); i >= 0; i--) {
            reversed += strX.charAt(i);
        }
        
        try {
            int result = Integer.parseInt(reversed);
            return isNegative ? result*-1 : result;
        } catch(NumberFormatException e) {
            return 0;
        }
        
        
    }
}