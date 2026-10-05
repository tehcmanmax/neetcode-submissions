class Solution:
    def largestUniqueNumber(self, nums: List[int]) -> int:

        counts = [0] * (max(nums) + 1)

        for num in nums:
            counts[num] += 1

        for i, count in reversed(list(enumerate(counts))):
            if count == 1:
                return i
        return -1