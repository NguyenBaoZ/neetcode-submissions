class Solution {
    public int[] getConcatenation(int[] nums) {
        int lens = nums.length;
        int[] ans = new int[lens*2];
        System.arraycopy(nums, 0, ans, 0, lens);
        System.arraycopy(nums, 0, ans, lens, lens);
        return ans;
    }
}