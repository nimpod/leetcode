/*  
    Revised solution:
        Runtime = 72ms, faster than 62.92%
        Memory = 38MB, less than 100%
        Time complexity = O(N)
*/
var countBinarySubstrings = function(s) {
    let current = 1;
    let previous = 0;
    let result = 0;
    
    for (let i = 1; i < s.length; i++) {
        // are the current and previous binary digits the same? (e.g. "00" or "11")
        if (s.charAt(i) == s.charAt(i-1)) {
            current++;      // if so, keep increasing the 'current' value
        }
        
        // otherwise the current and previous binary digits are different (e.g. "10" or "01")
        else {
            result += Math.min(current, previous);      // the number of valid substrings will be the minimum amount of 1's or 0's
            previous = current;
            current = 1;
        }
    }
    
    return result + Math.min(current, previous);        // update result for the final time
};

/**
 * +--------------------------------+
 * |Example run, s="0110001111"     |
 * +--------------------------------+
 * |current |previous|  result      |
 * +--------------------------------+
 * |   1    |   1    | min(1,0)=0   |   "01........"
 * |   2    |   1    |      0       |   ".11......."
 * |   1    |   2    | min(2,1)=1   |   "..10......"
 * |   2    |   2    |      1       |   "...00....."
 * |   3    |   2    |      1       |   "....00...."
 * |   1    |   2    | min(3,2)=2   |   ".....01..."
 * |   2    |   3    |      2       |   "......11.."
 * |   3    |   3    |      2       |   ".......11."
 * |   4    |   3    |      2       |   "........11"
 * +--------------------------------+
 *  = 2 + min(4,3)
 *  = 2 + 3
 *  = 5
 * 
 * 
 * is 5 correct? let's check...
 * s="0110001111"
 *    01                // substring 1
 *      10              // substring 2
 *       000111         // substring 3
 *        0011          // substring 4
 *         01           // substring 5
 * 
 * ∴ 5 was the correct answer!
 */