class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hset = new HashSet<>();
        for (int num : nums) {
            if (!hset.add(num)) { // set.add() returns boolean
                return true;
            } 
        }
        return false;
    }
}
