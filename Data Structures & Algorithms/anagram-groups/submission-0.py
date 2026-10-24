class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        count = {}
        for word in strs:
            w_sorted = "".join(sorted(word))

            if w_sorted in count:
                count[w_sorted].append(word)
            else:
                count[w_sorted] = [word]

        return [value for value in count.values()]