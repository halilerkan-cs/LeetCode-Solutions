class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = "";
        if(strs.length > 0){
            common = strs[0];
        }

        for(int i = 1; i < strs.length; i++){
            common = findCommonPrefix(common, strs[i]);
        }  

        return common;
    }

    public String findCommonPrefix(String str1, String str2) {
        String common = "";

        for(int i = 0; true; i++) {
            if(str1.length() > i && str2.length() > i) {
                if(str1.charAt(i) == str2.charAt(i)){
                    common += str1.charAt(i);
                }else{
                    break;
                }
            } else {
                break;
            }
        }

        return common;
    }
}