class Solution(object):
    
    ''' Initial brute force solution '''
    def removeOuterParentheses1(self, S):
        result = []
        x = 0
        xarr = []
        
        for c in S:
            xarr.append(c)
            if c == "(":
                x += 1
            else:
                x -= 1
            if x == 0:
                result.append("".join(xarr[1:-1]))
                xarr = []
        return "".join(result)
    
    
    ''' Optimised solution '''
    def removeOuterParentheses2(self, S):
        left = right = 0
        res = cur = ''
        
        for char in S:
            cur += char
            left += char == '('
            right += char == ')'
            if left == right:
                res += cur[1:-1]
                cur = ''
        return res


removeOuterParentheses1("(()())(())")
removeOuterParentheses2("(()())(())")
