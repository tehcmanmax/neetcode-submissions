#counting sort (for small input)
class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        count = [0] * 101

        for height in heights:
            count[height] += 1
        
        expected = []
        for i in range(1, 101):
            c = count[i]
            for _ in range(c):
                expected.append(i)
            

        res = 0
        for i in range(len(heights)):
            if heights[i] != expected[i]:
                res += 1
        return res
