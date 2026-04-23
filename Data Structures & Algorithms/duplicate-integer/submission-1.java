/*
Contains Duplicate
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false
*/
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hmap.containsKey(nums[i])) {
                hmap.merge(nums[i], 1, Integer::sum);
                return true;
            } else
                hmap.put(nums[i], 1);
        }
        return false;
    }
}
