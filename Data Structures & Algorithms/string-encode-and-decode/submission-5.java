class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for(String s: strs){
            str = str + s.length() + "#" + s;
        }
        return str;
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> list = new ArrayList<>();
        while(i < str.length()){
            int j = i + 1;
            while(str.charAt(j) != '#') j++;
            int length = Integer.parseInt(str.substring(i, j));
            list.add(str.substring(j + 1, j + length + 1));
            i = j + length + 1;
        }
        return list;
    }
}
