class Solution {

    /**
     * Initial Brute Force Solution:
     *      Runtime = 8ms, faster than 13.5%
     *      Memory = 34.7MB, less than 100%
     * 
     * Time complexity = O((r-l)*log(r))
     */
    public List<Integer> selfDividingNumbers1(int left, int right) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = left; i <= right; i++) {
            String arr = Integer.toString(i);
            int a = i;
            while (a > 0) {
                int n = Integer.parseInt(arr.substring(j,j+1));
                
                if (n == 0) {
                    break;
                } else if (i % Integer.parseInt(arr.substring(j,j+1)) != 0) {
                    break;
                } else {
                    j++;
                }                
                
                if (j == arr.length()) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    /**
     * Optimised Solution:
     *      Runtime = 2ms, faster than 91.26%
     *      Memory = 32.7MB, faster than 100%
     * 
     * Time complexity = O((r-l)*log(r))
     */
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = left; i <= right; i++) {
            int a = i;
            while (a > 0) {                
                int n = a % 10;     // get next digit of i
                    
                if (n == 0) {              // can't divide by 0
                    break;
                } else if (i % n != 0) {   // is not self-dividing
                    break;
                }
                a /= 10;            // shift 1 digit leftwards
                
                if (a <= 0) {       // each digit was self-divisible
                    result.add(i);
                }
            }
        }
        
        return result;

}