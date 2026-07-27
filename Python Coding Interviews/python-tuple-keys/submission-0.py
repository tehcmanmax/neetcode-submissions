from typing import List, Set, Tuple


def grid_to_set(grid: List[List[int]]) -> Set[Tuple[int, int]]:
    set_output = set()
    for row_index, row in enumerate(grid):
        for column_index , column in enumerate(row):
            if column == 1:
                set_output.add((row_index, column_index))
    return set_output



# do not modify below this line

output1 = grid_to_set([[1, 0, 1], [0, 1, 0], [1, 0, 1]])
print(type(output1))
print(sorted(list(output1)))
      
output2 = grid_to_set([[1, 0, 0], [0, 0, 0]])
print(type(output2))
print(sorted(list(output2)))

output3 = grid_to_set([[1, 1, 1], [1, 1, 1]])
print(type(output3))
print(sorted(list(output3)))

output4 = grid_to_set([[0, 0, 0], [0, 0, 0], [0, 0, 0]])
print(type(output4))
print(sorted(list(output4)))

#Challenge
#Implement the following function:

#grid_to_set(grid: List[List[int]]) -> Set[Tuple[int, int]] that takes a 2D grid of integers and returns a set of tuples
# where each tuple is a pair of the row and column. The set should only contain the coordinates of cells that have a value of 1.
#Example: Given a grid [[1, 0, 0], [0, 0, 0]] we should return a set with (0, 0). 
#This is because the cell at row 0, column 0 has a value of 1, and it is the only cell with a value of 1.
