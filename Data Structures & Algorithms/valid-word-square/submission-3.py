class Solution:
    def validWordSquare(self, words: List[str]) -> bool:
        rows = len(words)
        cols = 0

        for word in words:
            cols = max(cols, len(word))
        
        if cols != len(words[0]) or cols !=rows:
            return False
        
        new_words = []
        for col in range(cols):
            new_word = ''
            for row in range(rows):
                if col < len(words[row]):
                    new_word += words[row][col]
            new_words.append(new_word)

        return words == new_words