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