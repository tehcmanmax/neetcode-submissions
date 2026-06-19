from typing import List


def find_max_in_each_list(nested_arr: List[List[int]]) -> List[int]:
    return [max(sub_list) for sub_list in nested_arr]


# do not modify below this line
print(find_max_in_each_list([[1, 2], [3, 4, 2]]))
print(find_max_in_each_list([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))
print(find_max_in_each_list([[5, 6, 2, 8], [9], [9, 10], [11, 10, 11]]))


# find_max_in_each_list(nested_arr: List[List[int]]) -> List[int] which takes a 
# 2D list of integers and returns a list of the maximum element in each sublist. 
# The returned list should contain the maximum element from each sublist in the 
# order they appear in the input list.
# Example: find_max_in_each_list([[1, 2], [3, 4, 2]]) should return [2, 4].
# You may assume that each sublist will contain at least one element.
