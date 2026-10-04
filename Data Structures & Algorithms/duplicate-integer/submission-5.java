class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hashset = new HashSet<>(2*nums.length);
        for(int num : nums){
            if (!hashset.add(num)){
                return true;
            }
        }
        return false;
    }
}