class Solution {
    public int maxSubArray(int[] nums) {
        
        int currentsum = nums[0];
        int maxsum = nums[0];
        
        for(int i = 1 ; i < nums.length ; i++){

            currentsum = Math.max(nums[i] , currentsum + nums[i]);
            maxsum = Math.max(maxsum , currentsum);

        }
        return maxsum;

    }
}
// basically we are checking the current value is more benefecial or the current value is more better to use in the sum of previous and then updating tht final sum and display the max sum at the end ;