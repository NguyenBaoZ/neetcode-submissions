class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr2 = new int[nums.length*2];
        for(int i =0; i < nums.length; i++){
            arr2[i] = arr2[i+ nums.length] = nums[i];
        }
        return arr2;
    }
}