/*
You are given an array of distinct integers nums, sorted in
ascending order, and an integer target.

Implement a function to search for target within nums. 
If it exists, then return its index, otherwise, return -1.

O(logn) time.

Input: nums = [-1,0,2,4,6,8], target = 4
Output: 3

*/

class Solution { 
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while(l <= r){
        int mid = ((l + r) / 2); //not nums.length/2 ! length doesn't change
            if(nums[mid] < target){
                l = mid + 1;
            }
            else if(nums[mid] > target){
                r = mid - 1;
            }
            else return mid;
        }
        return -1;
    }
}
