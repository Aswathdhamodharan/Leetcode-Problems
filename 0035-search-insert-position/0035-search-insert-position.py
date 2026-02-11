class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        n=len(nums)
        st=0
        end=n-1
        while st<=end:
            mid=st+(end-st)//2
            if nums[mid]==target:
                return mid
            elif nums[mid]>target:
                end=mid-1
            else:
                st=mid+1
        return st