class Solution(object):

    ''' Initial brute force solution 
            Runtime = 68ms, faster than 47.18%
            Memory = 12.5MB, faster than 5.22%
    '''
    def sortArrayByParity1(self, A):
        evens = []
        odds = []
        
        for i in range(len(A)):
            if A[i]%2 == 0:
                evens.append(A[i])
            else:
                odds.append(A[i])
                
        return evens + odds

    ''' Simplified solution
            Runtime = 84ms, faster than 27.83%
            Memory = 12.3MB, faster than 5.04%
     '''
    def sortArrayByParity2(self, A):
        A.sort(key = lambda x : x%2)
        return A