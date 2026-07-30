from typing import List
from sortedcontainers import SortedSet


def get_first_three(sorted_set: SortedSet[int], nums1: List[int], nums2: List[int]) -> List[int]:
    sorted_set |= nums1 #union operator
    sorted_set -=nums2 #diff operator
    return sorted_set[:3]


# do not modify below this line
print(get_first_three(SortedSet(), [1, 2, 3], [4]))
print(get_first_three(SortedSet([1, 4, 7, 2, 8, 9]), [10], [1, 7, 2]))
print(get_first_three(SortedSet([1, 2, 3, 7]), [], [4, 5, 6]))
print(get_first_three(SortedSet([1, 2, 3, 4, 5, 6, 7, 8, 9]), [10, 11, 12], [1, 2, 3, 4, 5, 6, 7, 8, 9]))

#get_first_three(sorted_set: SortedSet[int], nums1: List[int], nums2: List[int]) -> List[int]. It takes a sorted set of integers 
#and two lists of integers, nums1 and nums2. The elements from nums1 should be added to the sorted set, and then the elements from 
#nums2 should be removed from the sorted set. Finally, return the first three elements of the sorted set.
#It's possible some elements in nums2 may not exist in the sorted set, so ensure your code does not raise an error in this case.
#You may assume there will always be at least three elements in the sorted set after adding and removing elements.
