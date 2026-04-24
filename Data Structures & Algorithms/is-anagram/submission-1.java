/*Given two strings s and t, return true if the two strings are anagrams of each other, otherwise
return false.

An anagram is a string that contains the exact same characters as another string, but the order of
the characters can be different.

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
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> smap = new HashMap();
        Map<Character, Integer> tmap = new HashMap();

        char[] sarray = s.toCharArray();
        char[] tarray = t.toCharArray();

        for (Character char1 : sarray) {
            smap.merge(char1, 1, Integer::sum);
        }

        for (Character char1 : tarray) {
            tmap.merge(char1, 1, Integer::sum);
        }

        for (Map.Entry<Character, Integer> entry : smap.entrySet()) {
            if (!entry.getValue().equals(tmap.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
}
