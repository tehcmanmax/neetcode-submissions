import heapq
from typing import List


def heap_pop(heap: List[int]) -> List[int]:
    return [heapq.heappop(heap) for _ in range(len(heap))]
# do not modify below this line
print(heap_pop([1, 2, 3]))
print(heap_pop([1, 3, 2]))
print(heap_pop([6, 7, 8, 12, 9, 10]))

#Implement the following function heap_pop(heap: List[int]) -> List[int] 
#that pops all elements from the heap heap and returns them in a list in 
#the order that they were popped. The heap should be a min heap, meaning 
#that the elements with the smallest priority should be popped first.

