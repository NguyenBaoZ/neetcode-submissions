class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);
        if(charArrayS.length != charArrayT.length){
            return false;
        }
        for(int i = 0 ; i < charArrayS.length; i++){
            if(charArrayS[i] != charArrayT[i]){
                return false;
            }
        }
        return true;
    }
}
