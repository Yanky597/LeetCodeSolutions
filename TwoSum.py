class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        '''
        The following is my solution to the Leet code problem "Two Sum"
        
        Using list comprehension we iterate through the list of nums and check if the target - currentValue
        is in the list, if yes we return the current index + the index of the second value.
        
       
        Written out in a more "traditional way" for better readability.

        for i in range(len(nums)):
            if((target-nums[i]) in nums and nums.index(target-nums[i]) != i):
                return [i, nums.index(target-nums[i])]
        '''

        return [[i, nums.index(target - nums[i])] for i in range(len(nums)) if
                ((target - nums[i]) in nums) and (nums.index(target - nums[i]) != i)][0]
