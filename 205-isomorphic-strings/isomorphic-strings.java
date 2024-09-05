class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> mapperS = new HashMap();
        Map<Character, Integer> mapperT = new HashMap();
        if(s.length() != t.length())
            return false;
        for(int i = 0; i < s.length(); i++) {
            Integer indexS = mapperS.get(s.charAt(i));
            Integer indexT = mapperT.get(t.charAt(i));
            if(indexS != indexT)
                return false;
            if(indexS == null){
                mapperS.put(s.charAt(i), i);
                mapperT.put(t.charAt(i), i);
            }
        }
        return true;
    }
}