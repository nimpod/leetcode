class Solution {
    /*  Initial brute force solution:
            Runtime = 5ms, faster than 97.30%
            Memory = 38.3MB, less than 90.61%

        Time complexity = O(N)
    */
    public boolean judgeCircle(String moves) {
        int x=0, y=0;

        char[] chars = moves.toCharArray();
        
        for (char c : chars) {
            switch(moves.charAt(i)) {
                case 'D':  y++; break;
                case 'U':  y--; break;
                case 'R':  x++; break;
                case 'L':  x--; break;
            }
        }

        return (x == 0 && y == 0);
    }

}