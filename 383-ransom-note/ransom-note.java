import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < ransomNote.length(); i++){
            Character c = ransomNote.charAt(i);
            Integer count = map.get(c);
            if(count == null){
                count = 0;
            }
            map.put(c, count + 1);
        }

        for(int i = 0; i < magazine.length() && !map.isEmpty(); i++){
            Character c = magazine.charAt(i);
            Integer count = map.get(c);
            if(count != null){
                if(count > 1){
                    map.put(c, count - 1);
                }else{
                    map.remove(c);
                }
            }
        }

        return map.isEmpty();
    }
}