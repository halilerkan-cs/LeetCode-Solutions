class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, String> mapWord = new HashMap<>();
        HashMap<String, String> mapChar = new HashMap<>();
        String[] words = s.split(" ");
        String[] chars = pattern.split("");

        if(words.length != chars.length)
            return false;

        for(int i = 0; i < words.length; i++) {
            if(!mapWord.containsKey(words[i]))
                mapWord.put(words[i], chars[i]);
            if(!mapChar.containsKey(chars[i]))
                mapChar.put(chars[i], words[i]);
            if(!mapWord.get(words[i]).equals(chars[i]) || !mapChar.get(chars[i]).equals(words[i])) {
                return false;
            }
        }

        return true;
    }
}