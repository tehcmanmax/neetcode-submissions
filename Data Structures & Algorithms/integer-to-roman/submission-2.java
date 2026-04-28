/*Integer to Roman
Medium
Topics
Company Tags
Seven different symbols represent Roman numerals with the following values:

Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000
Roman numerals are formed by appending the conversions of decimal place values from highest to
lowest. Converting a decimal place value into a Roman numeral has the following rules:

If the value does not start with 4 or 9, select the symbol of the maximal value that can be
subtracted from the input, append that symbol to the result, subtract its value, and convert the
remainder to a Roman numeral. If the value starts with 4 or 9 use the subtractive form representing
one symbol subtracted from the following symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9
is 1 (I) less than 10 (X): IX. Only the following subtractive forms are used: 4 (IV), 9 (IX), 40
(XL), 90 (XC), 400 (CD) and 900 (CM). Only powers of 10 (I, X, C, M) can be appended consecutively
at most 3 times to represent multiples of 10. You cannot append 5 (V), 50 (L), or 500 (D) multiple
times. If you need to append a symbol 4 times use the subtractive form. You are given an integer,
convert it to a Roman numeral.

Example 1:

Input: num = 3749

Output: "MMMDCCXLIX"
Explanation:
3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
700 = DCC as 500 (D) + 100 (C) + 100 (C)
40 = XL as 10 (X) less of 50 (L)
9 = IX as 1 (I) less of 10 (X)
Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places*/

// modulo gets digits from right
// division digits from left

class Solution {
    public String intToRoman(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num / 1000] +
                hundreds[(num % 1000) / 100] + 
                tens[num % 100 / 10] + 
                ones[num % 10];
    }
}