class Solution:
    def minOperations(self, nums: List[int]) -> int:
        if(len(nums)==1):
            return 0
        for i in range(0,len(nums)-1):
            if(nums[i]!=nums[i+1]):
                return 1
        return 0