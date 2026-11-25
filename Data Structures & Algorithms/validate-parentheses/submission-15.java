class Solution {
    public boolean isValid(String s) {
        Deque<Character> d = new ArrayDeque<>();
        int length = s.length();
        for(char c: s.toCharArray()){
            if(c == '[' || c == '{' || c == '(' ){
                d.add(c);
                continue;
            } 
            if(d.peekLast() == null) return false;
            if(c == ']' && d.pollLast() != '[') return false;
            else if(c == '}' && d.pollLast() != '{') return false;
            else if(c == ')' && d.pollLast() != '(') return false;
        }
        if(d.size() > 0) return false;
        return true;
    }
}
