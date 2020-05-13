class Solution {
    
    /*  Initial brute force solution:
            Runtime = 2ms, faster than 98.51%
            Memory = 38.4MB, less than 91.72%

        Time complexity = O(N)
    */
    public int[] diStringMatch(String S) {
        int N = S.length();
        int[] A = new int[N+1];
        
        int left = 0;
        int right = N;
        
        char[] str = S.toCharArray();
        
        for (int i = 0; i < str.length; i++) {
            switch (str[i]) {
                case 'I':
                    A[i] = left++; break;
                    
                case 'D':
                    A[i] = right--; break;
            }
        }
        A[N] = left;
        return A;
    }
}