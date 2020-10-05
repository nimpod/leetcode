'''  Initial brute force solution:
        Runtime = 200ms, faster than 71.36%
        Memory = 13.8MB, less than 29.79%
''' 

class Solution(object):
    def sortedSquares(self, A):
        square_nums = [ n*n for n in A ]
        square_nums.sort()
        return square_nums
        
        