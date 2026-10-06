class Solution:
    def largestUniqueNumber(self, nums: List[int]) -> int:

        counts = [0] * (max(nums) + 1)

        for num in nums:
            counts[num] += 1

        sort_nums =  []

        for num in range(len(counts)):
            for _ in range(counts[num]):
                sort_nums.append(num)

        for num in reversed(sort_nums):
            if counts[num] == 1:
                return num
        return -1