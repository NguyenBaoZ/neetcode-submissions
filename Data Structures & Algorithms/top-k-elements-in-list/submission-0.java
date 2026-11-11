class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int x: nums){
            if(map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            }
            else{
                map.put(x, 1);
            }
        }
        int[] topkKeys = map.entrySet().stream()
                        .sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.reverseOrder()))
                        .limit(k)
                        .mapToInt(Map.Entry::getKey)
                        .toArray();
        return topkKeys;
    }
}
