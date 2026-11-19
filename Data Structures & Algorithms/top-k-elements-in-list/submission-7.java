class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] list = new ArrayList [nums.length + 1];
        for(int key: map.keySet()){
            int ind = map.get(key);
            if(list[ind] == null){
                list[ind] = new ArrayList<>();
            }
            list[ind].add(key);
        }
        int[] ans = new int [k];
        int count = 0;
        for(int i = nums.length; i > 0; i--){
            if(list[i] != null){
                for(int num: list[i]){
                    ans[count++] = num;
                    if(count == k) break;
                }
            }
            if(count == k) break;
        }
        return ans;
    }
}
