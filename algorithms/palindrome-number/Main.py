'''  Initial brute force solution:
        Runtime = 40ms, faster than 95.69%
        Memory = 12.8MB, less than 50.81%
'''

class Solution(object):
    def isPalindrome(self, x):
        strX = str(x)
        strInvertedX = strX[::-1]
        return (strInvertedX == strX)