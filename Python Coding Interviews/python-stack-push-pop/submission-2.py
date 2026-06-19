# Challenge
# Implement the following function using the stack operations described above:
# reverse_list(arr: List[int]) -> List[int] that takes a list of integers and 
# returns a new list of the integers in reverse order.
# Hint: Recall that elements from a stack are removed in reverse order.


from typing import List


def reverse_list(arr: List[int]) -> List[int]:
    rev = list(reversed(arr)) # O(1)
    return rev


# do not modify below this line
print(reverse_list([1, 2, 3]))
print(reverse_list([3, 2, 1, 4, 6, 2]))
print(reverse_list([1, 9, 7, 3, 2, 1, 4, 6, 2]))
