class Solution {
    public int[] sortedSquares(int[] nums) {
        
        // for(int i=0;i<nums.length;i++){               //Brute force
        //     nums[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

      
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        for (int i = n - 1; i >= 0; i--) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++;
            } else {
                result[i] = rightSquare;
                right--;
            }
        }

        return result;

    }
}