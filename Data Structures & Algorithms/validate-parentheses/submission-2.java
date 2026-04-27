/*Valid Parentheses
Easy
Topics
Company Tags
Hints
You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.

The input string s is valid if and only if:

Every open bracket is closed by the same type of close bracket.
Open brackets are closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Return true if s is a valid string, and false otherwise.

Example 1:

Input: s = "[]"

Output: true
Example 2:

Input: s = "([{}])"

Output: true
Example 3:

Input: s = "[(])"

Output: false
Explanation: The brackets are not closed in the correct order.

Constraints:

1 <= s.length <= 1000
*/

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<String> stack = new Stack();
        Set<String> open = new HashSet(Arrays.asList("(", "[", "{"));
        Set<String> close = new HashSet(Arrays.asList(")", "]", "}"));
        Set<String> pairs = new HashSet(Arrays.asList("()", "[]", "{}"));

        String[] arr = s.split("");

        for (String symbol : arr) {
            if (open.contains(symbol)) {
                stack.push(symbol);
            } else if (close.contains(symbol)) {
                if (stack.isEmpty()) {
                    return false;
                }

                String lastOpen = stack.pop();
                if (!pairs.contains(lastOpen + symbol)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}