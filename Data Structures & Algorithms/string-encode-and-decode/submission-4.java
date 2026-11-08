class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder("");
        for(String s: strs){
            result.append(s.length()).append("#").append(s);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#') j++;
            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + len;
            list.add(str.substring(i,j));
            i = j;
        }
        return list;
    }
}
