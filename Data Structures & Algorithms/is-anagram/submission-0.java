/*Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false
Constraints:

s and t consist of lowercase English letters.
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sortedCharS = s.toCharArray();
        char[] sortedCharT = t.toCharArray();
        Arrays.sort(sortedCharS); // dual pivot quicksort O(n log n) worst O(n)
        Arrays.sort(sortedCharT);

        return Arrays.equals(sortedCharS, sortedCharT);
    }
}
