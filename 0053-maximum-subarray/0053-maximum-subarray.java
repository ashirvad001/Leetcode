class Solution {
    public int maxSubArray(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         int sum = 0;

//         for (int i = 0; i < nums.length; i++) {
//             sum = sum + nums[i];
//             if (sum > max) {
//                 max = sum;
//             }
//             if (sum < 0) {
//                 sum = 0; 
//             }
//         }
//         return max;
//     }
// }


int maxSum=nums[0];
int currentSum=nums[0];

for(int i=1;i<nums.length;i++){
    currentSum=Math.max(nums[i],currentSum+nums[i]);
    maxSum=Math.max(maxSum,currentSum);
}
return maxSum;
}
}