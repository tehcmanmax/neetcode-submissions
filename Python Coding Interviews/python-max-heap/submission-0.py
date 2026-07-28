import heapq
from typing import List


def get_reverse_sorted(nums: List[int]) -> List[int]:
    neg_heap = []
    output = []

    for v in nums:
        heapq.heappush(neg_heap, -v)
    while neg_heap:
        top = (-heapq.heappop(neg_heap))
        output.append(top)
    return output
    


# do not modify below this line
print(get_reverse_sorted([1, 2, 3]))
print(get_reverse_sorted([5, 6, 4, 2, 7, 3, 1]))
print(get_reverse_sorted([5, 6, -4, 2, 4, 7, -3, -1]))

#Implement the function get_reverse_sorted(nums: List[int]) -> List[int]
# which takes a list of integers and returns the integers in reverse sorted order. 
#You should use the max heap technique described above to achieve this. The list of integers given is not necessarily a heap.

