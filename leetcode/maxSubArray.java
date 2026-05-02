class maxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int CurrentSum = nums[0];
        for(int i = 1; i<nums.length; i++){
            CurrentSum = Math.max(CurrentSum+nums[i],nums[i]);
            maxSum = Math.max(CurrentSum,maxSum);
        }
        return maxSum;
    }
}