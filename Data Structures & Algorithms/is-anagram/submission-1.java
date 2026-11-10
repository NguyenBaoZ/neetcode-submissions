class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null) return false;
        if(s.length() == 0 || t.length() == 0) return false;
        if(s.length() != t.length()) return false;
        int[] cCount = new int [26];
        for(char c: s.toCharArray()) cCount[c - 'a']++; 
        for(char c: t.toCharArray()) cCount[c - 'a']--;
        for(int x: cCount){
            if(x != 0) return false;
        } 
        return true;
    }
}
