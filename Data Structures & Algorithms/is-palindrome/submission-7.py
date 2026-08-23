class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean = ""
        for char in s:
            if char.isalnum():
                clean += (char.lower())

        x = 0
        y = len(clean) - 1
        while x < y:
            if clean[x] != clean[y]:
                return False
            else:
                x += 1
                y -= 1
        return True

# palindrome