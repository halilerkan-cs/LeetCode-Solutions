class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        for(int i = digits.length - 1; i > 0; i--) {
            if(digits[i] > 9) {
                digits[i] -= 10;
                digits[i - 1] += 1; 
            }
        }

        if(digits[0] > 9){
            int[] newNumber = new int[digits.length + 1];
            for(int i = 1; i < digits.length; i++)
                newNumber[i + 1] = digits[i];
            newNumber[1] = digits[0] - 10;
            newNumber[0] = digits[0] / 10;
            return newNumber;
        }
        return digits;
    }
}