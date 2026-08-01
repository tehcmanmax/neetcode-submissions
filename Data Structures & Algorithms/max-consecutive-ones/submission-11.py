class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max_one_count = 0
        count = 0
        for num in nums:
            if num==1:
                count += 1
            else:
                if count > max_one_count:
                    max_one_count = count
                count = 0
        if count > max_one_count:
            max_one_count = count
        return max_one_count
#You are given a binary array nums, return the maximum number of consecutive 1's in the array.