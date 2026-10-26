from collections import Counter

class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        output = []
        
        if len(s) < len(p):
            return output
    
        s_count, p_count = Counter(s[:len(p)]), Counter(p)
        if s_count == p_count:
            output.append(0)

        for i in range(len(p), len(s)):
            s_count[s[i]] += 1

            s_count[s[i - len(p)]] -= 1

            if s_count[s[i - len(p)]] == 0:
                del s_count[s[i - len(p)]]
            
            if s_count == p_count:
                output.append(i - len(p) + 1)


        return output
