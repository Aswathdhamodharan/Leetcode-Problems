class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        n=len(nums)
        a=-1
        b=-1
        ans=[]
        for i in range(0,n):
            if nums[i]==target:
                if a==-1:
                    a=i
                b=i
        return [a,b]