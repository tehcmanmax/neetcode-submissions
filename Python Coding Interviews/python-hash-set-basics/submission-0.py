from typing import List, Set


def build_hash_set(keys: List[str]) -> Set[str]:
    output_key_set = {key for key in keys}
    return output_key_set

def check_keys(hash_set: Set[str], keys: List[str]) -> List[bool]:
    output_bool_list = [key in hash_set for key in keys]
    return output_bool_list

# do not modify below this line

output1 = build_hash_set(["Alice", "Bob", "Charlie"])
print(type(output1))         # check the type of the output
print(sorted(list(output1))) # set order is not guaranteed so we need to sort the list

output2 = build_hash_set(["XY", "XX", "YY", "XY", "YX"]) 
print(type(output2))         # check the type of the output
print(sorted(list(output2))) # set order is not guaranteed so we need to sort the list

print(check_keys({"Alice", "Bob", "Charlie"}, ["Alice", "Bob", "Charlie", "David"]))
print(check_keys({'a', 'b', 'c'}, ['a', 'd', 'c']))
print(check_keys({'a', 'c'}, ['d', 'c']))

#build_hash_set(keys: List[str]) -> Set[str]. It takes a list of strings and returns a
# hash set containing those strings.
# check_keys(hash_set: Set[str], keys: List[str]) -> List[bool]. It takes a hash set and 
# a list of keys and returns a list of booleans indicating whether each key exists in the 
# hash set. The order of the booleans in the output list should match the order of the keys in the input list.
# Example: check_keys({'a', 'b', 'c'}, ['a', 'd', 'c']) should return [True, False, True].
