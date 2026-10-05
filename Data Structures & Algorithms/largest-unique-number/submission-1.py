class Solution:
    def largestUniqueNumber(self, nums: List[int]) -> int:
        dict_larg_numb = {}
        
        for num in nums:
            dict_larg_numb[num] = dict_larg_numb.get(num, 0) + 1

        sorted_dict = sorted(dict_larg_numb.items(), reverse=True)

        for key, value in sorted_dict:
            if value == 1:
                return key
        return -1