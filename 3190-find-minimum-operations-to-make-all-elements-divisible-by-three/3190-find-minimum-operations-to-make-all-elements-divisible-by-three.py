class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        n=len(nums)
        count=0
        for i in range(0,n):
            if nums[i]%3!=0:
                count+=1
        return count