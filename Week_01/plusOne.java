class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        int[] newDigits = new int[len + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}