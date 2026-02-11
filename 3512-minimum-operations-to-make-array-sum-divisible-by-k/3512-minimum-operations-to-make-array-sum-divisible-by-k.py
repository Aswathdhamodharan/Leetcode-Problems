class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        n=len(nums)
        return sum(nums)%k