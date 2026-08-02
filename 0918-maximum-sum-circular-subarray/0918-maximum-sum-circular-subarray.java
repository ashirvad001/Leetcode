class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum=nums[0];

        int maxSum=nums[0];
        int maxCurrent =nums[0];

        int minSum=nums[0];
        int minCurrent=nums[0];

        for(int i=1;i<nums.length;i++){

            totalSum=totalSum+nums[i];


            maxCurrent=Math.max(nums[i],maxCurrent+nums[i]);
            maxSum=Math.max(maxSum,maxCurrent);

            minCurrent=Math.min(nums[i],minCurrent+nums[i]);
            minSum=Math.min(minSum,minCurrent);


        }
         if(maxSum<0){
            return maxSum;
        }
        int wrapSum=totalSum-minSum;
        return Math.max(maxSum,wrapSum);

    }
}