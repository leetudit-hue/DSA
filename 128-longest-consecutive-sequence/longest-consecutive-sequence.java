class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longest = 0;
        int curr = 0;
        int ls = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i = 0 ; i < n ; i++){
            if(nums[i]-1 == ls){
                curr++;
                ls = nums[i];
            }
            else if(nums[i]-1 > ls){
                curr = 1;
                ls = nums[i];
            }
            longest = Math.max(longest,curr);
        }
        return longest;
    }
}