class Solution:
    def findLonelyPixel(self, picture: List[List[str]]) -> int:
        row_size = len(picture)
        col_size = len(picture[0])

        row_count = row_size * [0]
        col_count = col_size * [0]

        for i in range(row_size):
            for j in range(col_size):
                if picture[i][j]=='B':
                    row_count[i] += 1
                    col_count[j] += 1
        
        result = 0
        for i in range(row_size):
            for j in range(col_size):
                    if picture[i][j]=='B' and row_count[i] == 1 and col_count[j] == 1:
                        result += 1
        return result