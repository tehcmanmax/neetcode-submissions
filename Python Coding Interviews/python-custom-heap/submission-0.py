#Challenge
#This technique can also be used to implement a max heap. Implement the 
#function get_reverse_sorted(nums: List[int]) -> List[int] which takes a 
#list of integers and returns the integers in reverse sorted order. You should use the tuple technique described above to achieve this.

import heapq
from typing import List


def get_reverse_sorted(nums: List[int]) -> List[int]:
    cust_heap = []
    output = []
    for val in nums:
        heapq.heappush(cust_heap, (-(val), val))

    for _ in range(len(cust_heap)):
        tupl = heapq.heappop(cust_heap)
        output.append(tupl[1])
    return output


# do not modify below this line
print(get_reverse_sorted([1, 2, 3]))
print(get_reverse_sorted([5, 6, 4, 2, 7, 3, 1]))
print(get_reverse_sorted([5, 6, -4, 2, 4, 7, -3, -1]))
