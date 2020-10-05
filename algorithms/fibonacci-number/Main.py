'''  Initial brute force solution:
        Runtime = 1040ms, faster than 26.83%
        Memory = 13.4MB, less than 9.07%
'''

class Solution(object):
    def fib(self, N):
        if (N <= 1):
            return N
        else:
            return self.fib(N-1) + self.fib(N-2)