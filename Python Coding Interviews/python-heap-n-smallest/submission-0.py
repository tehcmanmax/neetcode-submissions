import heapq
from typing import List


def get_min_element(arr: List[int]) -> int:
    output = heapq.nsmallest(1, arr)
    return output[0]


def get_min_4_elements(arr: List[int]) -> List[int]:
    return heapq.nsmallest(4, arr)


def get_min_2_elements(arr: List[int]) -> List[int]:
    # Return elements in *decreasing* order
    two_sm = heapq.nsmallest(2, arr)
    output = heapq.heapify_max(two_sm)
    return two_sm


# do not modify below this line
print(get_min_element([1, 2, 3]))
print(get_min_element([3, 2, 1, 4, 6, 2]))
print(get_min_element([1, 9, 7, 3, 2, 1, 4, 6, 2]))

print(get_min_4_elements([1, 9, 7, 3, 2, 1, 4, 6, 2]))
print(get_min_4_elements([1, 9, 7, 2, 1, 3, 2, 1, 4, 6, 2, 1]))
print(get_min_4_elements([1, 9, 7, 2, 3, 2, 4, 6, 2]))

print(get_min_2_elements([1, 9, 7, 3, 2, 1, 4, 6, 2]))
print(get_min_2_elements([1, 9, 7, 2, 1, 3, 2, 1, 4, 6, 2, 1]))
print(get_min_2_elements([1, 9, 7, 2, 3, 2, 4, 6, 2]))

#Implement the following functions using heapq.nsmallest():

#get_min_element(arr: List[int]) -> int that returns the smallest element in the list arr.
#get_min_4_elements(arr: List[int]) -> List[int] that returns the 4 smallest elements in the list arr in increasing order.
#get_min_2_elements(arr: List[int]) -> List[int] that returns the 2 smallest elements in the list arr in decreasing order.
