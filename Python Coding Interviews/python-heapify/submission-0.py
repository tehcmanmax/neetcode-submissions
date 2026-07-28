import heapq
from typing import List


def heapify_strings(strings: List[str]) -> List[str]:
    heapq.heapify(strings)
    return strings


def heapify_integers(integers: List[int]) -> List[int]:
    heapq.heapify(integers)
    return integers


def heap_sort(nums: List[int]) -> List[int]:
    heapq.heapify(nums)
    nums.sort()
    return nums


# do not modify below this line
print(heapify_strings(["b", "a", "e", "c", "d"]))
print(heapify_integers([3, 4, 5, 1, 2, 6]))
print(heap_sort([3, 4, 5, 1, 2, 6]))

#heapify_strings(strings: List[str]) -> List[str] that takes a list of strings and returns a 
#list of strings that have been transformed into a min heap.
#heapify_integers(integers: List[int]) -> List[int] that takes a list of integers and returns
# a list of integers that have been transformed into a min heap.
#heap_sort(nums: List[int]) -> List[int] that takes a list of integers and returns a list of integers that have 
#been sorted in ascending order. You should use the heapify function to transform the list into a heap before sorting it.
