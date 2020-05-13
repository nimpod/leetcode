public class Solution {

    /*  Initial brute force solution
            Runtime = 1ms, faster than 100%
            Memory = 42.8MB, faster than 13.42%
    */
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        
        // left and right quadrant pointers 
        int left = 0;
        int right = result.length-1;

        for(int i = 0; i < A.length; i++) {
            // if next elem is even, place in the left quadrant
            if(A[i] % 2 == 0) {
                result[left] = A[i];
                left++;
            }
            
            // if the next elem is odd, place in the right quadrant
            else {
                result[right] = A[i];
                right--;
            }
        }
        
        return result;    
        
    }

}
    