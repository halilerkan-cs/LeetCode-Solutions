class Solution {
    public boolean isSubsequence(String s, String t) {

        int position = 0, wantedChar = 0;
        for(; position < t.length() && wantedChar < s.length(); position++){
            if(s.charAt(wantedChar) == t.charAt(position)){
                wantedChar++;
            }
        }

        return wantedChar == s.length();
    }
}