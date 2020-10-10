'''
    Initial brute force solution:
        Runtime = 164ms, faster than 5.31%
        Memory = 16.4MB, less than 72.60%
'''
class Solution(object):
    def maxDepth(self, root):
        if (root is None):  # Base case: node does not exist, end of subtree
            return 0
        else:    # Recursive case: node exists, contains a subtree
            left = self.maxDepth(root.left)
            right = self.maxDepth(root.right)
            
            if (left > right):
                return left+1
            else:
                return right+1

'''
    Optimised solution, the only stuff that has changed is in the else-statement. Removed unneccesary inline variable initialisation, and replaced 4-line conditional that figured out which of left and right was bigger, using Python's max() function:
        Runtime = 32ms, faster than 65.77%
        Memory = 16.2MB, less than 72.60%
'''
class Solution(object):
    def maxDepth(self, root):
        if (root is None):
            return 0
        else:
            return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
            
'''
    Even more optimised solution! Switch the conditional around so we are not wasting computation on checking if the node is null all the time, because more often than not the node isn't null, so it's pointless wasting that computation.
        Runtime = 24ms, faster than 95.97%
        Memory = 16.1MB, less than 72.60%
'''
class Solution(object):
    def maxDepth(self, root):
        if (root is not None):
            return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
        else:
            return 0
            
            
        