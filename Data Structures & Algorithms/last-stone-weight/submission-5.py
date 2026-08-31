class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        neg_stones = [-x for x in stones]
        min_heap = neg_stones
        heapq.heapify(min_heap)
        while len(min_heap) > 1:
            first = heapq.heappop(min_heap)
            second = heapq.heappop(min_heap)
            if first != second:
                res = first - second
                heapq.heappush(min_heap, res)
        heapq.heappush(min_heap, 0)
        return -1 * heapq.heappop(min_heap)