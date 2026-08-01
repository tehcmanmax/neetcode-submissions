class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max_one_count = 0
        count = 0
        for num in nums:
            if num==1:
                count += 1
            else:
                max_one_count = max(count, max_one_count)
                count = 0
        max_one_count = max(count, max_one_count)
        return max_one_count
#You are given a binary array nums, return the maximum number of consecutive 1's in the array.