from typing import List
from sortedcontainers import SortedDict


def remove_keys(sorted_dict: SortedDict[str, int], keys: List[str]) -> SortedDict[str, int]:
    [sorted_dict.pop(key) for key in keys]
    return sorted_dict


def get_values_before_target(sorted_dict: SortedDict[str, int], target: str) -> List[int]:
    return [v for k, v in sorted_dict.items() if k < target] #list coprehension


# do not modify below this line
print(remove_keys(SortedDict({'Alice': 25, 'Bob': 30, 'Charlie': 35}), ['Bob']))
print(remove_keys(SortedDict({'Alice': 25, 'Bob': 30, 'Charlie': 35, 'David': 40}), ['Bob', 'David']))
print(remove_keys(SortedDict({'Alice': 25, 'Bob': 30, 'Charlie': 35, 'David': 40, 'Eve': 45}), ['Alice', 'Eve']))

print(get_values_before_target(SortedDict({'Alice': 25, 'Bob': 30, 'Charlie': 35}), 'Bob'))
print(get_values_before_target(SortedDict({'Alice': 25, 'Bob': 30, 'Charlie': 35, 'David': 40}), 'David'))
print(get_values_before_target(SortedDict({'Alice': 25, 'Bob': 30, 'Charlie': 35, 'David': 40}), 'Charlie'))
print(get_values_before_target(SortedDict({'Alice': 25, 'Bob': 30, 'Charlie': 35, 'David': 40}), 'Bob'))
print(get_values_before_target(SortedDict({'Alice': 25, 'Bob': 30, 'Charlie': 35, 'David': 40}), 'Alice'))


# remove_keys(sorted_dict: SortedDict[str, int], keys: List[str]) -> SortedDict[str, int]. It should take a sorted dictionary
# and a list of keys and remove the key-value pairs associated with those keys from the dictionary. Return the modified sorted dictionary.
# You may assume that all keys in the list exist in the sorted dictionary.

# get_values_before_target(sorted_dict: SortedDict[str, int], target: str) -> List[int]. It should take a
# sorted dictionary and a target key and return a list of values associated with keys that come before the target key in sorted order.
# You may assume that the target key exists in the sorted dictionary.
# The order of the values in the output list should match the order of the keys in the sorted dictionary.
# Example: get_values_before_target(SortedDict({'Alice': 90, 'Bob': 80, 'Charlie': 70}), 'Charlie') should return [90, 80].
