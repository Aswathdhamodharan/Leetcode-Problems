class Solution:
    def hasIncreasingSubarrays(self, nums, k):
        if k == 1:
            return True
        size = 1
        i, j = 1, k + 1
        while j < len(nums):
            if nums[i] > nums[i - 1] and nums[j] > nums[j - 1]:
                size += 1
            else:
                size = 1

            if size == k:
                return True

            i += 1
            j += 1
        return False