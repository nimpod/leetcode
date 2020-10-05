/*  Initial brute force solution:
        Runtime = 0ms, faster than 100%
        Memory = 38.4MB, less than 69.79%
*/

class Solution {
    public double myPow(double x, int n) {        
        // edge case: (expononet is 0)
        if (n == 0) {
            ///System.out.printf("here0: (x=%.1f, n=%d) => 1 \n", x, n);
            return 1;
        }
        
        // using recursion find a new temporary result, gradually getting closer and closer to the actual value
        double xtemp = myPow(x, n/2);
        
        if (n % 2 == 0) {
            ///System.out.printf("here1: (x=%.1f, n=%d) => %.1f \n", x, n, xtemp*xtemp);
            return xtemp*xtemp;
        } else {
            if (n > 0) {
                ///System.out.printf("here2: (x=%.1f, n=%d) => %.1f \n", x, n, (xtemp*xtemp)*x);
                return (xtemp*xtemp)*x;
            } else {
                ///System.out.printf("here3: (x=%.1f, n=%d) => %.1f \n", x, n, (xtemp*xtemp)/x);
                return (xtemp*xtemp)/x;
            }
        }
    }
}