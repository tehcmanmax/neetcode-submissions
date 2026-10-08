class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        candidates = defaultdict(int) #if in future key doesn't exist, default key is 0
        res = max_count = 0

        for num in nums:
            candidates[num] += 1 #increasing value
            if max_count < candidates[num]: 
                max_count = candidates[num]
                res = num    
        return res
