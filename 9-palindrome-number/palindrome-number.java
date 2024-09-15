class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int numberOfDigit = 0;
        for(; Math.pow(10, numberOfDigit) <= x; numberOfDigit++);

        for(int i = 1; i <= numberOfDigit / 2; i++) {
            if((int)(x % Math.pow(10, i)) / (int)(Math.pow(10, i - 1))
                != ((int)(x % Math.pow(10, numberOfDigit - i + 1)) / (int)Math.pow(10, numberOfDigit - i)))
                return false;
        }
        return true;
    }
}