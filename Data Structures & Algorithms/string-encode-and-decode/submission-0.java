class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(String x: strs){
            res = res.concat(x.length() + "#" + x);
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while (j < str.length() && str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            int startIndex = j + 1;
            int endIndex = startIndex + length;
            list.add(str.substring(startIndex, endIndex));
            i = endIndex;
        }
        return list;
    }
}
