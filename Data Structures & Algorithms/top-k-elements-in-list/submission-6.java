class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int x: nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<Integer>[] list = new ArrayList [nums.length + 1];
        for(int key: map.keySet()){
            if(list[map.get(key)] == null){
                list[map.get(key)] = new ArrayList<>();
            }
            list[map.get(key)].add(key);    
        }
        int[] ans = new int[k];
        int count = 0;
        for(int i = nums.length; i >= 0; i--){
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
