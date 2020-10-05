/*  Initial brute force solution:
        Runtime = 50ms, faster than 35.55%
        Memory = 28.4MB, less than 29.79%
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int N = nums.length;        
        int[] result = new int[2];
                
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}