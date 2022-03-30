class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        low = 0
        high = len(height)-1
        maxArea = 0
        
        while(low != high):
            currentCupHeight = min(height[low], height[high])
            area = ((high+1) - (low+1)) * currentCupHeight
            maxArea = max(area, maxArea) 
            
            if(height[high] > height[low]) :
                low += 1
            else:
                high -= 1
                
        
        return maxArea
