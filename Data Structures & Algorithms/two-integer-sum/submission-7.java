class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int r = nums.length - 1;
        while(l <= r){
            if(map.containsKey(target - nums[l])){
                int x = map.get(target - nums[l]);
                return new int[] {Math.min(x, l), Math.max(x, l)};
            }
            map.put(nums[l], l);
            if(map.containsKey(target - nums[r])){
                int x = map.get(target - nums[r]);
                return new int[] {Math.min(x, r), Math.max(x, r)};
            }
            map.put(nums[r], r);
            l++;
            r--;
        }
        return new int[] {};
    }
}
