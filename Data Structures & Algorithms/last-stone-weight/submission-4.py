# Last Stone Weight
class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones.sort()
        while len(stones) > 1:
            res = stones[len(stones)-1] -  stones[len(stones)-2]
            if res == 0:
                stones.pop()
                stones.pop()
            else:
                stones.pop()
                stones.pop()
                stones.append(res)
            stones.sort()
        if len(stones) == 0:
            return 0
        else: 
            return stones[0]