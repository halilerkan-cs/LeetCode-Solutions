class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String[] chars = s.split("");
        for(int i = 0, j = chars.length - 1; i < j; i++, j--) {
            if(!chars[i].equals(chars[j]))
                return false;
        }
        return true;
    }
}